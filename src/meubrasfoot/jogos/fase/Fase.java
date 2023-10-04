/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot.jogos.fase;

import java.util.LinkedList;
import meubrasfoot.Clube;
import meubrasfoot.jogos.Rodada;
import meubrasfoot.jogos.Torneio;

/**
 *
 * @author Gustavo
 */
public abstract class Fase {
    
    protected int numRodadas;
    protected int rodadaAtual;
    protected LinkedList<Clube> clubes;
    protected Rodada[] rodadas;
    protected Fase proximaFase;
    protected Fase faseAnterior;
    protected Torneio torneio;
    protected boolean finalizada;
    
    public Fase(LinkedList<Clube> clubes){
        this.clubes = clubes;
        this.rodadaAtual=0;
        this.finalizada = false;
    }
    
    public abstract void geraRodadas();
    
    public Rodada runRodada(){
        if(this.finalizada) return null;
        
        Rodada r = this.rodadas[this.rodadaAtual];
        r.run();
        this.rodadaAtual++;
        if(rodadaAtual>=numRodadas){
            this.finalizada = true;
        }
        return r;
    }
    
    public boolean hasNextRodada(){
        return this.finalizada;
    }
    
    public abstract LinkedList<Clube> getClassificados();
    public abstract LinkedList<Clube> getRebaixados();
    
    public void printRodadas(){
        for (Rodada r : rodadas) {
            r.printPartidas();
        }
    }
}
