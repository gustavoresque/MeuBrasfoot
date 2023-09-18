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
    
    private int id;
    private String nome;
    private String abreviacao;    
    private String nacionalidade;
    private int reputacao;
    private float saldo;
    //private String estadio;
    //private String estado;
    //private int anoFuncacao;    
    private LinkedList<Jogador> jogadores;
    private LinkedList<Jogador> titulares;
    private LinkedList<Jogador> reservas;
    

     
    public Clube(int id, String nome, String abreviacao, String nacionalidade, int reputacao, float saldo) {
        this.id = id;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.nacionalidade = nacionalidade;
        this.reputacao = reputacao;
        this.saldo = saldo;                
        this.jogadores = new LinkedList<>();
        //this.estadio = estadio;
        //this.estado = estado;
        //this.anoFuncacao = anoFuncacao;
        
    }
    
   
    public int getId() {
        return id;
    }
        
    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

//    public String getEstadio() {
//        return estadio;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public int getAnoFuncacao() {
//        return anoFuncacao;
//    }

  
    public int getReputacao() {
        return reputacao;
    }

    public float getSaldo() {
        return saldo;
    }
    
    

    public  LinkedList<Jogador> getJogadores() {
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
        return  "id:" + this.id +" " +this.nome+" ("+this.abreviacao+")\n"+
                "Nacionalidade: "+this.nacionalidade+"\n"+
                "Reputacao: "+this.reputacao+"\n"+
                "Saldo: R$"+this.saldo+"\n"+  
                //"Estadio: "+this.estadio+"\n"+
                //"Estado: "+this.estado+"\n"+                
                //"Ano de Fundação: "+this.anoFuncacao+"\n"+
                "Jogadores: "+this.jogadores.toString()+"\n";
    }
    
}
