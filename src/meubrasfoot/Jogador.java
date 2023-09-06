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
    private float salario;
    private Clube clube;
    private int idade;

    public Jogador(String nome, int numero, String posicao, float salario, Clube clube, int idade) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.salario = salario;
        this.clube = clube;
        this.clube.addJogador(this);
        this.idade = idade;
    }
    
    
    
    
    public void venda(Clube clubeVendedor, Clube clubeComprador, float valor){
        if(clubeVendedor.equals(this.clube) && this.salario <= valor){
            this.clube = clubeComprador;
            this.salario = valor;
        }
    }

    @Override
    public String toString() {
        return this.nome+" - "+this.numero+"\n"+
                "Posição: "+this.posicao+"\n"+
                "Clube: "+this.clube.getNome()+"\n"+
                "Passe: R$"+this.salario+"\n";
        
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    void setClube(Clube clube) {
        this.clube = clube;
    }
    
    
    
    
}
