/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot;

/**
 *
 * @author Gustavo
 */
public class Jogador {
    
    
    private String nome;
    private int numero;
    private String posicao;
    private float valor;
    private String clube;
    private int idade;

    public Jogador(String nome, int numero, String posicao, float valor, String clube, int idade) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.valor = valor;
        this.clube = clube;
        this.idade = idade;
    }
    
    
    
    
    public void venda(String clubeVendedor, String clubeComprador, float valor){
        if(clubeVendedor.equals(this.clube) && this.valor <= valor){
            this.clube = clubeComprador;
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return this.nome+" - "+this.numero+"\n"+
                "Posição: "+this.posicao+"\n"+
                "Clube: "+this.clube+"\n"+
                "Passe: R$"+this.valor+"\n";
        
    }
    
    
    
    
}
