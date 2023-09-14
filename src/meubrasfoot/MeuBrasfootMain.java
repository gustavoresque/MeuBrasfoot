/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meubrasfoot;

import ui.TelaPrincipal;

/**
 *
 * @author Gustavo
 */
public class MeuBrasfootMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello Brasfoot!!");
        
        //Readxml xml = new Readxml();
        //xml.Readerxml(jogadores, clubes);
        
        Clube paysandu = new Clube("Paysandu", "PAY", "Curuzu", "Pará", 1914);
        Clube tuna = new Clube("Tuna", "TUN", "Estadio", "Pará", 1930);
        
        Jogador j = new Jogador("Gustavo0 ",1,"GK",200,paysandu,30);
        Jogador j1 = new Jogador("Gustavo1 ",2,"CB",200,paysandu,30);
        Jogador j2 = new Jogador("Gustavo2 ",3,"CB",200,paysandu,30);
        Jogador j3 = new Jogador("Gustavo3 ",4,"CM",200,paysandu,30);
        Jogador j4 = new Jogador("Gustavo4 ",5,"ST",200,paysandu,30);
        
        Jogador j5 = new Jogador("Gustavo5",1,"GK",200,tuna,30);
        Jogador j6 = new Jogador("Gustavo6",5,"CB",200,tuna,30);
        Jogador j7 = new Jogador("Gustavo7",6,"CB",200,tuna,30);
        Jogador j8 = new Jogador("Gustavo8",7,"CM",200,tuna,30);
        Jogador j9 = new Jogador("Gustavo9",8,"ST",200,tuna,30);
        System.out.println(j.toString());
//        j.venda(paysandu, tuna, 300);

        paysandu.venderJogador(j, tuna, 250, 300);
        System.out.println(j.toString());
        
        
        System.out.println(paysandu.toString());
        
        System.out.println(tuna.toString());
        
       
        
        
        //<editor-fold>
        //Abre a tela principal
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }
    
}
