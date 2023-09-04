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
    
    
    String nome;
    int numero;
    char posicao;
    float valor;
    String clube;
    
    
    public void venda(String clubeVendedor, String clubeComprador, float valor){
        if(clubeVendedor.equals(this.clube) && this.valor <= valor){
            this.clube = clubeComprador;
            this.valor = valor;
        }
    }
    
    
    
}
