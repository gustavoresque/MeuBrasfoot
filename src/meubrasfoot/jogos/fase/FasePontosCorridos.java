/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot.jogos.fase;

import java.util.LinkedList;
import meubrasfoot.Clube;
import meubrasfoot.jogos.Partida;
import meubrasfoot.jogos.Rodada;
import meubrasfoot.jogos.Torneio;

/**
 *
 * @author Gustavo
 */
public class FasePontosCorridos extends Fase{
    
    
    private int numClubes;

    public FasePontosCorridos(LinkedList<Clube> clubes, int classificados, int rebaixados) {
        super(clubes);
        this.numClubes=super.clubes.size();
    }

    @Override
    public void geraRodadas() {
        
        int n = this.numClubes;
        super.rodadas = new Rodada[n-1];
        
        for (int i = 1; i < n; i++) {
            //0-i
            Partida[] partidas = new Partida[n/2];
            System.out.println("(0,"+i+")");
            partidas[0] = new Partida(this.clubes.get(0),this.clubes.get(i));
            int r = ((i)%(n-1))+1;
            int l = ((i-1)%(n-1));
            l=(l>0)?l:l+(n-1);
            for (int j = 0; j < (n-2)/2; j++) {
                //r-l
                partidas[j+1] = new Partida(this.clubes.get(r),this.clubes.get(l));
                System.out.println("("+r+","+l+")");
                r=((r)%(n-1))+1;
                l=((l-1)%(n-1));
                l=(l>0)?l:l+(n-1);
            }
            super.rodadas[i-1] = new Rodada(partidas);
        }
    }

    @Override
    public LinkedList<Clube> getClassificados() {
        return null;
    }

    @Override
    public LinkedList<Clube> getRebaixados() {
        return null;
    }
    
    
    
}
