
package central;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author oafre
 */

public class Central extends Thread{
    private Socket ligacaoCelula = null;
    private static int nLigacoes = 0;
    
    public Central (Socket ligacaoCelula)
    {
        this.ligacaoCelula=ligacaoCelula;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     try
        {
            
            //Criar um processo à escuta na porta 5000 para as escutas
            ServerSocket ss = new ServerSocket (15000); 
             
            while(true)
            {
                    System.out.println("A aguardar ligações!");
                    // Ficar a aguardar que alguem se ligue à porta 5000
                    Socket ligacaoCelula = ss.accept();
                    System.out.println("Alguem se ligou....");
                    Thread t = new Central(ligacaoCelula);
                    t.start();           
            }
        }catch (IOException ioe)
        {
            System.out.println("Erro ao criar ServerSocket: " + ioe);
        }
    }  
    public void TratarMsgInserir(String msg)
    {
        String nCelula = msg.substring(0,msg.indexOf("|"));
        msg = msg.substring(msg.indexOf("|")+1);
        String tipo = msg.substring(0,msg.indexOf("|"));
        msg = msg.substring(msg.indexOf("|")+1);
        String nEscuta = msg.substring(0,msg.indexOf("|"));
        String dados = msg.substring(msg.indexOf("|")+1);
        
        GereBD bd = new GereBD();
        bd.inserirDados(tipo, nEscuta, nCelula, dados);
        
    }
    
    public void run()
    {

        try {

            //criar um canal de saída
            PrintStream saida = new PrintStream(ligacaoCelula.getOutputStream());
            
            //Criar um canal de entrada
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader (ligacaoCelula.getInputStream()));
            
            this.nLigacoes++;
            saida.println(this.nLigacoes);
            
            Contador cont = new Contador(saida, 60,"C"+this.nLigacoes);
            Thread t2 = cont;
            t2.start();
         
            //Ler dados da entrada...enviados pelo cliente
            String msg = "";
            //sair é a plavra de término...
            while (!msg.equalsIgnoreCase("sair"))
            {
            
                msg = entrada.readLine();
                System.out.println("Recebi: " + msg);
                TratarMsgInserir(msg);  
                cont.setTempo(60);
            }

            
            saida.println("Vou desligar.");
            
            entrada.close();
            saida.close();
            ligacaoCelula.close();
    
        } catch (IOException ex) {
             System.out.println("Erro durante o atendimento/ Thread");
        }
    }

}