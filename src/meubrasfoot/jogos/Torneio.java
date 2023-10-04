/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot.jogos;

import meubrasfoot.jogos.fase.FasePontosCorridos;
import meubrasfoot.jogos.fase.Fase;
import java.util.LinkedList;
import meubrasfoot.Clube;

/**
 *
 * @author Gustavo
 */
public class Torneio {
    
    
    private String nome;
    private LinkedList<Clube> clubes;
    protected LinkedList<Fase> fases;
    protected int faseAtualIndex;
    private Fase faseAtual;
    private boolean finalizado;

    public Torneio(LinkedList<Clube> clubes) {
        this.clubes = clubes;
        this.faseAtualIndex = 0;
        this.fases = new LinkedList<>();
        this.faseAtual = new FasePontosCorridos(clubes, 4, 4);
        this.faseAtual.geraRodadas();
        this.faseAtual.printRodadas();
        this.fases.add(faseAtual);
    }
    
    
    
    public Rodada runRodada(){
        if(this.finalizado)
            return null;
        
        if(!this.faseAtual.hasNextRodada()){
            this.faseAtualIndex++;
            if(this.fases.size() > this.faseAtualIndex){
                this.faseAtual = this.fases.get(faseAtualIndex);
            }else{
                this.finalizado = true;
            }
        }
        return this.faseAtual.runRodada();
    }
    
    public boolean isFinalizado() {
        if(this.fases.size() <= this.faseAtualIndex){
            this.finalizado = true;
        }
        return this.finalizado ;
    }
   

    public String getNome() {
        return nome;
    }
}
