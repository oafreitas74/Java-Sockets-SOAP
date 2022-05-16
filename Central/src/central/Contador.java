
package central;

import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oafre
 */
public class Contador extends Thread{
  
    private PrintStream saida =  null;
    private int tempo=0;
        private String nCelula=null;
        
public Contador(PrintStream saida, int tempo, String nCelula)
    {
        this.saida=saida;
        this.tempo=tempo;
        this.nCelula = nCelula;
    }
    
    public void setTempo(int tempo)
    {
        this.tempo = tempo;
    }
    
    
    @Override
    public void run()
    {
        while(this.tempo > 0)
        {
            System.out.println("Tempo da " + this.nCelula+" -> "+tempo+" s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(this.tempo == 1)
            {
                saida.println("Enviar");
                System.out.println("Enviar " + this.nCelula);
                this.tempo = 61;
            }
            this.tempo--;
        }
    }
}
