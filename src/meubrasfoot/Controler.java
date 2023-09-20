/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meubrasfoot;

import java.util.LinkedList;
import model.Readxml;

/**
 *
 * @author Gustavo
 */
public class Controler {
    
    private static Controler controler = new Controler();
    
    
    private LinkedList<Clube> clubes =  new LinkedList<Clube>();
    private LinkedList<Jogador> jogadores =  new LinkedList<Jogador>();
        
//    private Clube[] clubes;
//    private Jogador[] jogadores;
    private int temporada;
    private Campeonato[] campeonatos;
    
    private Controler() {
        this.temporada = 2023;
    }
    
    
    public static Controler getInstance() {
        return Controler.controler;
    }
    
    
    public void loadDatabase(){ 
        Readxml xml = new Readxml();
        xml.Readerxml(this.clubes, this.jogadores);
    }
  
        
    public LinkedList<Clube> getClubes() {
        return clubes;
    }

    public LinkedList<Jogador> getJogadores() {         
        return jogadores;
    }
    
    public void getClubeByID(int ID){          
        
     }
}   
    
   