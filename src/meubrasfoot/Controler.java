/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot;

/**
 *
 * @author Gustavo
 */
public class Controler {
    
    private static Controler controler = new Controler();
    
    private Clube[] clubes;
    private Jogador[] jogadores;
    private int temporada;
    private Campeonato[] campeonatos;

    private Controler() {
        this.temporada = 2023;
    }
    
    
    public static Controler getInstance() {
        return Controler.controler;
    }
    
    
    public boolean loadDatabase(){ return false; }

    
    
    
    public Clube[] getClubes() {
        return clubes;
    }

    
    public Jogador[] getJogadores() {
        return jogadores;
    }
    
    public Clube getClubeByID(String ID){
        return null;
    }
    
    
    
    
    
}
