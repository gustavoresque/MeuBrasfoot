/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot;

import java.util.LinkedList;

/**
 *
 * @author Gustavo
 */
public class Clube {
    
    private String nome;
    private String abreviacao;
    private String estadio;
    private String estado;
    private int anoFuncacao;
    private LinkedList<Jogador> jogadores;
    private LinkedList<Jogador> titulares;
    private LinkedList<Jogador> reservas;
    private float saldo;

    
    public Clube(String nome, String abreviacao, String estadio, String estado, int anoFuncacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.estadio = estadio;
        this.estado = estado;
        this.anoFuncacao = anoFuncacao;
        this.jogadores = new LinkedList<>();
        this.saldo = 500;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getEstado() {
        return estado;
    }

    public int getAnoFuncacao() {
        return anoFuncacao;
    }

    public LinkedList<Jogador> getJogadores() {
        return jogadores;
    }
    
    
    public void venderJogador(Jogador j, Clube comprador, float valor, float novoSalario){
        comprador.jogadores.add(j);
        this.jogadores.remove(j);
        this.saldo+=valor;
        comprador.saldo-=valor;
        j.setSalario(novoSalario);
        j.setClube(comprador);
    }
    
    
    
    public void addJogador(Jogador j){
        this.jogadores.add(j);
    }
//    
//    private void removeJogador(Jogador j){
//        this.jogadores.remove(j);
//    }

    @Override
    public String toString() {
        return this.nome+" ("+this.abreviacao+")\n"+
                "Estadio: "+this.estadio+"\n"+
                "Estado: "+this.estado+"\n"+
                "Saldo: R$"+this.saldo+"\n"+
                "Ano de Fundação: "+this.anoFuncacao+"\n"+
                "Jogadores: "+this.jogadores.toString()+"\n";
    }
    
}
