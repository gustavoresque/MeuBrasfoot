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
    private int idade; 
    private String nacionalidade;
    private String posicao;
    private float power;
    private float potencia;
    private float valor;
    private float salario;
    private Clube clube;    
    //private int numero;
    

    public Jogador(String nome, int idade, String nacionalidade, String posicao, float power, float potencia, float valor, float salario, Clube clube) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
        this.power = power;
        this.potencia = potencia;
        this.valor = valor;        
        this.salario = salario;        
        this.clube = clube;
        this.clube.addJogador(this);
        //this.numero = numero;
    }
      
        
    public void venda(Clube clubeVendedor, Clube clubeComprador, float valor){
        if(clubeVendedor.equals(this.clube) && this.salario <= valor){
            this.clube = clubeComprador;
            this.salario = valor;
        }
    }

    @Override
    public String toString() {
        return this.nome+
                //" - "+this.numero+"\n"+
                "Posição: "+this.posicao+"\n"+
                "Power: "+this.power+"\n"+
                "Potencia: "+this.potencia+"\n"+
                "Clube: "+this.clube.getNome()+"\n"+
                "Salario: "+this.salario+"\n"+
                "Passe: R$"+this.valor+"\n";
        
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    void setClube(Clube clube) {
        this.clube = clube;
    }
    
    
    
    
}
