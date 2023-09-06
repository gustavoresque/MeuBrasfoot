/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meubrasfoot;

/**
 *
 * @author Gustavo
 */
public class MeuBrasfootMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello Brasfoot!!");
        
        Clube paysandu = new Clube("Paysandu", "PAY", "Curuzu", "Pará", 1914);
        Clube tuna = new Clube("Tuna", "TUN", "Estadio", "Pará", 1930);
        
        Jogador j = new Jogador("Gustavo",7,"Meia",200,paysandu,30);
        System.out.println(j.toString());
//        j.venda(paysandu, tuna, 300);

        paysandu.venderJogador(j, tuna, 250, 300);
        System.out.println(j.toString());
        
        
        System.out.println(paysandu.toString());
        
        System.out.println(tuna.toString());
        
       
        
    }
    
}
