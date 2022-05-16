
package escuta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Comunicacao extends Thread{

    private Escuta esc = null;
    private Socket ligacao = null;
    private PrintStream saida = null;
    
    public Comunicacao(Escuta esc, Socket ligacao)
    {
        this.esc = esc;
        this.ligacao = ligacao;
    }

    
    public boolean ligar(int porta)
    {
        
        try {
            
            if (ligacao == null)
            {
               ligacao = new Socket ("127.0.0.1", porta);
       
               saida = new PrintStream (ligacao.getOutputStream());
            }
           
         
            Thread t = new Comunicacao(esc, ligacao);
            t.start();

        } catch (IOException ex) {
            
        }
        
         
        return false;
    }
    
    public void enviarDados(String dados)
    {
        saida.println(dados);
    }
    
    
    @Override
    public void run()
    {
        BufferedReader entrada =null;
        try {
            entrada = new BufferedReader
                          (new InputStreamReader(ligacao.getInputStream()));
      
                
                String dadosRecebidos = entrada.readLine();  
                while(esc.getNEscuta()==null){
                    esc.setNEscuta("E"+dadosRecebidos);
                }
            } catch (IOException ex) {
            
            }
       
    }
}

