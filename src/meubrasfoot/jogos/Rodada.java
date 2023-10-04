/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot.jogos;

/**
 *
 * @author Gustavo
 */
public class Rodada {
    
    private Partida[] partidas;

    public Rodada(Partida[] partidas) {
        this.partidas = partidas;
    }
    
    public void run(){
        for (Partida partida : partidas) {
            partida.run();
        }
    }
    
    public void printPartidas(){
        System.out.println("---- Rodada ----");
        for (Partida p : partidas) {
            System.out.println(p);
        }
        System.out.println("\n\n\n");
    }
    
}
