package celula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;



/**
 *
 * @author oafre
 */
public class ComuniCentral extends Thread{
    private BufferedReader entradaCentral = null;
    private PrintStream saidaCentral =  null;
    public ComuniCentral(BufferedReader entradaCentral, PrintStream saidaCentral)
    {
        this.entradaCentral = entradaCentral;
        this.saidaCentral=saidaCentral;
    }
    
    @Override
    public void run()
    {
        
        try {
            while(true)
            {
                String dadosRecebidos = entradaCentral.readLine();
                if(dadosRecebidos.equalsIgnoreCase("Enviar"))
                {
                    Celula cel = new Celula(null,null);
                    cel.EnviarMsgCentral(saidaCentral);
                }
                    
            }
        } catch (IOException ex) {
            System.out.println("Erro durante o atendimento/ Thread");
        }
        
        
    }
}
