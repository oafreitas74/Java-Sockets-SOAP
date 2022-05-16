/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuta;


import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oafre
 */
public class Escuta extends Thread{

    private static String tipoCelula;
    private static String nEscuta = null;

    public void setTipoCelula(String tipoCelula)
    {
       this.tipoCelula = tipoCelula;
    }
    public void setNEscuta(String nEscuta)
    {
       this.nEscuta = nEscuta;
    }
    public String getTipoCelula()
    {
       return this.tipoCelula;
    }
    public String getNEscuta()
    {
       return this.nEscuta;
    }
        //  menu principal
    public static String menu() { 
	int opcao = 0;
        String tipoCelula = "";
        Scanner ler = new Scanner(System.in);
	do {
            System.out.println("Que tipo de celula é?");
            System.out.println("1 - Audio");
            System.out.println("2 - Imagem");
            System.out.println("3 - Vídeo");
            System.out.println("Escolha uma opção");
            
		opcao = ler.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1 -> {
                    tipoCelula = "Aud";
                    opcao = 0;
                }
		case 2 -> {
                    tipoCelula = "Ima";
                    opcao = 0;
                }
		case 3 -> {
                    tipoCelula = "Vid";
                    opcao = 0;
                }case 0 -> {
                    System.out.println("Opção Inválida!");
                    opcao = 99;
                }
		default -> System.out.println("Opção Inválida!");
		}
	} while (opcao != 0);
        return tipoCelula;
    }

    public static int escolherCelula() { 
	int opcao = 0;
        int porta = 5000;
        Scanner ler = new Scanner(System.in);
	do {
            System.out.println("A que celula se quer ligar?");
            System.out.println("1 - C1 -> Porta 5000");
            System.out.println("2 - C2 -> Porta 5001");
            System.out.println("3 - C3 -> Porta 5002");
            System.out.println("Escolha uma opção");
            
		opcao = ler.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1 -> {
                    porta = 5000;
                    opcao = 0;
                }
		case 2 -> {
                    porta = 5001;
                    opcao = 0;
                }
		case 3 -> {
                    porta = 5002;
                    opcao = 0;
                }case 0 -> {
                    System.out.println("Opção Inválida!");
                    opcao = 99;
                }
		default -> System.out.println("Opção Inválida!");
		}
	} while (opcao != 0);
        return porta;
    }
   
    
    public static void main(String[] args) {

        Escuta esc = new Escuta();

        esc.setTipoCelula(menu());
        
        Comunicacao com = new Comunicacao(esc,null);
        int porta = esc.escolherCelula();
        System.out.println("Porta "+porta);
        com.ligar(porta);
        //esperar para que o NEscuta seja guardado
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escuta.class.getName()).log(Level.SEVERE, null, ex);
            }

        System.out.println("Escuta "+esc.getNEscuta()+" de "+esc.getTipoCelula());
        String cabecalho = esc.getTipoCelula()+"|"+esc.getNEscuta()+"|";

        Thread t = new CriarDados(cabecalho, com);
        t.start();
        Scanner ler = new Scanner(System.in);
        
        String entrada = ler.next();
        com.enviarDados(entrada);
    }   
}
