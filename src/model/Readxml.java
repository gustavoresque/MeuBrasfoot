
package model;

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
    
    
    String FILENAME = "c:\\Brasileirao_SerieA.xml"; 
    
    public void Readerxml(LinkedList<Clube> clube, LinkedList<Jogador> jogadores){
               
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
                    String reputacaoclu = element.getElementsByTagName("reputacao").item(0).getTextContent();
                    String dinheiroclu = element.getElementsByTagName("dinheiro").item(0).getTextContent();
                    
                    int ID = Integer.parseInt(id);
                    int reputacao = Integer.parseInt(reputacaoclu);
                    float dinheiro = this.match(dinheiroclu); 
                    Clube t1 = new Clube(ID, nome, sigla, nation, reputacao, dinheiro);
                    clube.add(t1);
                                       
                    //System.out.println(t1);
                    
                                        
                    NodeList listaDeFilhos = doc.getElementsByTagName("jogadores");
                    
                    int tamanhoListaFilhos = listaDeFilhos.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhos.item(j);

                        //verifico se são tipo element
                        if (noFilho.getNodeType() == Node.ELEMENT_NODE) {

                            //converto o no filho em element filho
                            Element elementoFilho = (Element) noFilho;
                                                       
                            //verifico em qual filho estamos pela tag  
                            String nomejog = elementoFilho.getElementsByTagName("nome").item(0).getTextContent();
                            String idadejog = elementoFilho.getElementsByTagName("ano").item(0).getTextContent();
                            String nacionalidade = elementoFilho.getElementsByTagName("nacionalidade").item(0).getTextContent();
                            String posicao = elementoFilho.getElementsByTagName("posicao").item(0).getTextContent();
                            String powerjog = elementoFilho.getElementsByTagName("power").item(0).getTextContent();
                            String potjog = elementoFilho.getElementsByTagName("pot").item(0).getTextContent();
                            String valorjog = elementoFilho.getElementsByTagName("valor").item(0).getTextContent();
                            String custojog = elementoFilho.getElementsByTagName("custo").item(0).getTextContent();
                                                          
                            int idade = Integer.parseInt(idadejog);
                            float power = Float.parseFloat(powerjog);
                            float potencia = Float.parseFloat(potjog);
                            float valor = this.match(valorjog); 
                            float custo = this.match(custojog); 
                            
                            
                            Jogador t2 = new Jogador(nomejog,idade, nacionalidade, posicao, power, potencia, valor, custo, t1);
                            jogadores.add(t2);
                            //t1.addJogador(t2);
                                                         
                        }
                    }
                                 
                }
            }
                
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    
    // Transformar notação k e m para número
    public float match (String input){
        if (input.endsWith("k")) {            
            float numero = Float.parseFloat(input.substring(0, input.length() - 1));
            float numeroExpandido = numero * 1000;
            return numeroExpandido;
        }else if (input.endsWith("m")){
            float numero1 = Float.parseFloat(input.substring(0, input.length() - 1));
            float numeroExpandido1 = numero1 * 1000000; // 1 milhão
            return numeroExpandido1;
        }else {
            float numero3 = Float.parseFloat(input);
            return numero3;
            
        }
    }
}
