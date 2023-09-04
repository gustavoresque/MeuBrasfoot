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
        
        
        Jogador j = new Jogador("Gustavo",7,"Meia",200,"Paysandu");
        System.out.println(j.toString());
        j.venda("Paysandu", "Tuna", 300);
        System.out.println(j.toString());
        
       
       System.out.println(j.toString());
       
        
    }
    
}
