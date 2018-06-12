/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;


public class JuegoNuevo extends JFrame {
    
    Container contentpane = getContentPane(); 
    JLabel imagen;
    JButton juegonuevo;
    
    public JuegoNuevo(){
    
    super ("Juego Nuevo");
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);
        this.setResizable(false);
         setLocationRelativeTo(null);
        contentpane.setLayout(null);
        contentpane.setBackground(Color.WHITE);
        
        
        
        //boton Juego Nuevo
        juegonuevo= new JButton(new ImageIcon("65375-gamepad.png"));
        juegonuevo.setBounds(150,100,500,100);
        juegonuevo.setText("Juego Nuevo");
        juegonuevo.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); 
        juegonuevo.setBackground(Color.WHITE);
        juegonuevo.setForeground(Color.BLACK);
        juegonuevo.setOpaque(true);
        juegonuevo.setBorderPainted(false);
        juegonuevo.setFocusable(false);
        juegonuevo.setOpaque(false);
        add(juegonuevo);
        
        juegonuevo.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                
            Menu b=new Menu();
            b.setVisible(true);
    
        }
        }); 
        
        //imagen de fondo 
        imagen= new JLabel(new ImageIcon("backc-radio-turquesa.jpg"));
        imagen.setBounds(0,0,800, 400);
        add(imagen);
        
       
        
    
    }
    
}
