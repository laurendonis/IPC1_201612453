/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tablero extends JFrame{
    
    JLabel [][] bMatriz;
    JPanel panel;
    
    public Tablero(){
       add(getjpanel());
       add(getTexto());
       iniciarlizar();
       
   }
    
    public int tamMatriz(int tam){
      int tamaño=tam;
      return tamaño;
        
   }
    
    public JPanel getjpanel(){
   
       JPanel Panel=new JPanel();
       
       int tamaño=tamMatriz();
       bMatriz=new JLabel[tamaño][tamaño];
       Panel.setLayout(new GridLayout(tamaño,tamaño));
       int numr=(int)Math.random()*10;
       
       Panel.setBounds(100,100,300,300);
       for (int i=0; i<tamaño;i++){
           for (int j=0; j<tamaño; j++){
               bMatriz[i][j]=new JLabel (String.valueOf(numr));
               Panel.add(bMatriz[i][j]);
           }
       }
       
       return Panel;
   }
   
}
