/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testexml;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import meubrasfoot.Clube;
import meubrasfoot.Jogador;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author natã
 */
public class Readxml {
    
    Clube clube = new Clube();
    String FILENAME = "c:\\Brasileirao_SerieA.xml"; 
    
    public void Readerxml(LinkedList<Jogador> jogadores, LinkedList<Clube> clubes){
        
       
//Instancia a fábrica
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(FILENAME));

            // opcional, mas recomendado
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
            
                       
            // get <times>
            NodeList list = doc.getElementsByTagName("time");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;
 
                    // get text
                    String id = element.getElementsByTagName("id").item(0).getTextContent();
                    String nome = element.getElementsByTagName("nome").item(0).getTextContent();                    
                    String sigla = element.getElementsByTagName("sigla").item(0).getTextContent();
                    String nation = element.getElementsByTagName("nation").item(0).getTextContent();
                    String reputacao = element.getElementsByTagName("reputacao").item(0).getTextContent();
                    String dinheiro = element.getElementsByTagName("dinheiro").item(0).getTextContent();
                    
                                        
                    Clube paysandu = new Clube(nome, sigla, "Curuzu", nation, 1914);
                    
                                        
                    NodeList listaDeFilhosDaPessoa = doc.getElementsByTagName("jogadores");
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);

                        //verifico se são tipo element
                        if (noFilho.getNodeType() == Node.ELEMENT_NODE) {

                            //converto o no filho em element filho
                            Element elementoFilho = (Element) noFilho;
                                                       
                            //verifico em qual filho estamos pela tag  
                            String nomejog = elementoFilho.getElementsByTagName("nome").item(0).getTextContent();
                            String idade = elementoFilho.getElementsByTagName("ano").item(0).getTextContent();
                            String nacionalidade = elementoFilho.getElementsByTagName("nacionalidade").item(0).getTextContent();
                            String posicao = elementoFilho.getElementsByTagName("posicao").item(0).getTextContent();
                            String power = elementoFilho.getElementsByTagName("power").item(0).getTextContent();
                            String pot = elementoFilho.getElementsByTagName("pot").item(0).getTextContent();
                            String valor = elementoFilho.getElementsByTagName("valor").item(0).getTextContent();
                            String custo = elementoFilho.getElementsByTagName("custo").item(0).getTextContent();
                            
                            Jogador j1 = new Jogador(nomejog,5,posicao,200,paysandu,30);
                            clube.addJogador(j1);
                                                         
                        }
                    }
                   //System.out.printf("-------------");    
                   //System.out.printf("\n");                                    
            
                }
            }
                

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    
}
