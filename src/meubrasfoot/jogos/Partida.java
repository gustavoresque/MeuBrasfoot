/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot.jogos;

import java.util.Random;
import meubrasfoot.Clube;

/**
 *
 * @author Gustavo
 */
public class Partida {
    
    private Clube cMandante;
    private Clube cVisitante;
    private int golsMandante;
    private int golsVisitante;
    private static Random r = new Random(System.currentTimeMillis());;

    public Partida(Clube cMandante, Clube cVisitante) {
        this.cMandante = cMandante;
        this.cVisitante = cVisitante;
        this.golsMandante = -1;
        this.golsVisitante = -1; 
    }
    
    public void run(){
        
        this.golsMandante = Partida.r.nextInt(0, 4);
        this.golsVisitante = Partida.r.nextInt(0, 3);
    }

    @Override
    public String toString() {
        return this.cMandante.getNome()+(golsMandante>=0?golsMandante:"_")+
                "X"+(golsVisitante>=0?golsVisitante:"_")+this.cVisitante.getNome();
    }
    
    
    
}
