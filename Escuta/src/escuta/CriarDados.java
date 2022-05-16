/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuta;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oafre
 */
public class CriarDados extends Thread{
    
    private static String cabecalho = null;
    private static Comunicacao com = new Comunicacao(null,null);
    
    public CriarDados(String cabecalho,Comunicacao com)
    {
        this.cabecalho = cabecalho;
        this.com = com;
    }
    
     //Criar os dados da escuta
    public static String criarDados() 
    {
        int v = 0;
        String dados = "";
        Random gerador = new Random();

      String[] a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
          "P","Q","R","S","T","U","V","W","X","Y","Z","a","b",
          "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
          "t","u","v","w","x","y","z","0","1","2","3","4",
          "5","6","7","8","9"};
        for (int i = 0; i < 30; i++) {
            v = gerador.nextInt(62);
            dados = dados + a[v];
        }
        return dados;
    }
  
    @Override
    public void run()
    {
        String dados = "";
        while(true){
            dados = criarDados();
            com.enviarDados(cabecalho+dados);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escuta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
