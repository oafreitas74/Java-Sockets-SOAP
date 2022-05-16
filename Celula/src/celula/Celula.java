
package celula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



/**
 *
 * @author oafre
 */
public class Celula extends Thread{
    private Socket ligacaoEscutas = null;
    PrintStream saidaCentral = null;
    private static String nCelula = null;
    private static int nLigacoes = 0;
    private static int contador = 0;
    private static ArrayList<String> escutasList = null;
    
    public void setNCelula(String nCelula)
    {
       this.nCelula = nCelula;
    }

    public String getNCelula()
    {
       return this.nCelula;
    }
    public int getNLigacoes()
    {
       return this.nLigacoes;
    }
    public Celula (Socket ligacaoEscutas, PrintStream saidaCentral)
    {
        this.ligacaoEscutas=ligacaoEscutas;
        this.saidaCentral=saidaCentral;
    }
    
    public static void main(String[] args) {
        
        try
        {
                        
            //Ligar-me a Central 
            Socket ligacaoCentral = new Socket("127.0.0.1", 15000);
            //Canal de Entrada vindo da central
            BufferedReader entradaCentral = new BufferedReader(new 
                InputStreamReader (ligacaoCentral.getInputStream()));
            //Canal de Saida vindo da central
            PrintStream saidaCentral = new PrintStream (
                    ligacaoCentral.getOutputStream());

            Celula cel = new Celula(null, null);
            String dadosRecebidos = entradaCentral.readLine();
                
                System.out.println("Celula -> C"+dadosRecebidos);
                while(cel.getNCelula()==null){
                    cel.setNCelula("C"+dadosRecebidos);
                }
            
            Thread t2 = new ComuniCentral(entradaCentral,saidaCentral);
            t2.start();
            
            //Criar um processo à escuta na porta 5000 para as escutas
            int porta = 4999 + Integer.parseInt(dadosRecebidos)  ;
            System.out.println("Porta -> " + porta);
            ServerSocket ss = new ServerSocket (porta);
            
            escutasList = new ArrayList();  
            while(true)
            {
                    System.out.println("A aguardar ligações!");
                    // Ficar a aguardar que alguem se ligue à porta 5000
                    Socket ligacaoEscutas = ss.accept();
                    System.out.println("Alguem se ligou....");
                    Thread t = new Celula(ligacaoEscutas,saidaCentral);
                    t.start();           
            }
        }catch (IOException ioe)
        {
            System.out.println("Erro ao criar ServerSocket: " + ioe);
        }
    }  
    
    public void EnviarMsgCentral(PrintStream saidaCentral)
    {
        contador = 0;//reeniciar o contador
        if(this.escutasList.size() == 0)
        {
            saidaCentral.println("Não existe dados para enviar");
        }
        else
        {
            for (int i=0; i < this.escutasList.size(); i++)
            {
                saidaCentral.println(this.nCelula +"|"+this.escutasList.get(i));
            }
            escutasList.clear(); //limpar a lista 
        }
 
    }
    
    public void run()
    {

        try {
            
            //criar um canal de saída da escuta
            PrintStream saida = new PrintStream(ligacaoEscutas.getOutputStream());
            
            //Criar um canal de entrada da escuta
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader (ligacaoEscutas.getInputStream()));
                        
            this.nLigacoes++;
            saida.println(this.nLigacoes);


          
            //Ler dados da entrada...enviados pela escuta
            String msg = "";
            //sair é a plavra de término...
            while (!msg.equalsIgnoreCase("sair"))
            {
                contador++;
                msg = entrada.readLine();
                System.out.println("Recebi:"+contador+" " + msg);
                escutasList.add(msg);
                if(contador == 10)
                    EnviarMsgCentral(saidaCentral); 
                
            }

            
            saida.println("Vou desligar. Bye Bye");
            
            entrada.close();
            saida.close();
            ligacaoEscutas.close();
        } catch (IOException ex) {
             System.out.println("Erro durante o atendimento/ Thread");
        }
    }
}
