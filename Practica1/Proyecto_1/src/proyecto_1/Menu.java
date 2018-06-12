
package proyecto_1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame{
    Container contentpane = getContentPane(); 
    JLabel imagen,nombres,nombre1,orden,tiempo,indicaciones,p1,p2,p3,tamaño;
    JButton empezar,personajes;
    JTextField jugador1, jugador2,per1,per2,per3, pers1,pers2,pers3, temp,tam;
    
    public Menu(){
        super ("Configuración");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);
        this.setResizable(false);
        setLocationRelativeTo(null);
        contentpane.setLayout(null);
        contentpane.setBackground(Color.WHITE);
    
        //nombres de jugadores 
        nombres= new JLabel("Nombres de Jugadores:");
        nombres.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        nombres.setBounds(10,10,250,25);
        add(nombres);
        
        //jugador 1 
        nombre1= new JLabel("Jugador 1:");
        nombre1.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        nombre1.setBounds(50,50,150,25);
        add(nombre1);
        
        //area de texto para jugador1
        jugador1= new JTextField(25);
        jugador1.setBounds(150,50,150,25);
        add(jugador1);
        
        //jugador 2 
        nombre1= new JLabel("Jugador 2:");
        nombre1.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        nombre1.setBounds(50,85,150,25);
        add(nombre1);
        
        //area de texto para jugador 2
        jugador2= new JTextField(25);
        jugador2.setBounds(150,85,150,25);
        add(jugador2);
        
        //boton Juego Nuevo
        personajes= new JButton(new ImageIcon());
        personajes.setBounds(500,40,200,100);
        personajes.setText("Personajes");
        personajes.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); 
        personajes.setBackground(Color.WHITE);
        personajes.setForeground(Color.BLACK);
        personajes.setOpaque(true);
        personajes.setBorderPainted(false);
        personajes.setFocusable(false);
        personajes.setOpaque(false);
        add(personajes);
        
        //Orden de los Personajes
        orden= new JLabel("Oden de los Personajes:");
        orden.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        orden.setBounds(10,130,250,25);
        add(orden);
        
        //indicaciones 
        indicaciones= new JLabel("Ingrese el orden de los personajes, Los personajes son: Mago, Guerrero, Princesa.");
        indicaciones.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        indicaciones.setBounds(10,160,700,25);
        add(indicaciones);
        
        //jugador 1 
        nombre1= new JLabel("Jugador 1:");
        nombre1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        nombre1.setBounds(10,195,150,25);
        add(nombre1);
        
        //personaje 1
        p1= new JLabel("Personaje 1:");
        p1.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p1.setBounds(50,225,150,25);
        add(p1);
        
        //area de texto personaje 1
        per1= new JTextField(25);
        per1.setBounds(150,225,150,25);
        add(per1);
        
         //personaje 2
        p2= new JLabel("Personaje 2:");
        p2.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p2.setBounds(50,260,150,25);
        add(p2);
        
        //area de texto personaje 2
        per2= new JTextField(25);
        per2.setBounds(150,260,150,25);
        add(per2);
        
         //personaje 3
        p3= new JLabel("Personaje 3:");
        p3.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p3.setBounds(50,295,150,25);
        add(p3);
        
        //area de texto personaje 3
        per3= new JTextField(25);
        per3.setBounds(150,295,150,25);
        add(per3);
        
        //jugador 2 
        nombre1= new JLabel("Jugador 2:");
        nombre1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        nombre1.setBounds(400,195,150,25);
        add(nombre1);
        
        //personaje 1
        p1= new JLabel("Personaje 1:");
        p1.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p1.setBounds(440,225,150,25);
        add(p1);
        
        //area de texto personaje 1
        pers1= new JTextField(25);
        pers1.setBounds(540,225,150,25);
        add(pers1);
        
        //personaje 2
        p2= new JLabel("Personaje 2:");
        p2.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p2.setBounds(440,260,150,25);
        add(p2);
        
        //area de texto personaje 2
        pers2= new JTextField(25);
        pers2.setBounds(540,260,150,25);
        add(pers2);
        
        //personaje 3
        p3= new JLabel("Personaje 3:");
        p3.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        p3.setBounds(440,295,150,25);
        add(p3);
        
        //area de texto personaje 3
        pers3= new JTextField(25);
        pers3.setBounds(540,295,150,25);
        add(pers3);
        
        //tiempo
        tiempo= new JLabel("Tiempo de Juego:");
        tiempo.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        tiempo.setBounds(10,335,250,25);
        add(tiempo);
        
        //tiempo del juego
        tiempo= new JLabel("Ingrese el tiempo que durará la partida.");
        tiempo.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        tiempo.setBounds(10,365,400,25);
        add(tiempo);
        
         //area de texto para tiempo
        temp= new JTextField(25);
        temp.setBounds(150,400,150,25);
        add(temp);
        
        //tamaño del tablero
        tiempo= new JLabel("Tamaño del Tablero:");
        tiempo.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); 
        tiempo.setBounds(400,335,400,25);
        add(tiempo);
        
        //tiempo del juego
        tiempo= new JLabel("Ingrese el tamaño del tablero.");
        tiempo.setFont(new java.awt.Font("Century Gothic", 0, 15)); 
        tiempo.setBounds(400,365,400,25);
        add(tiempo);
        
        //area de texto para el tablero
        tam= new JTextField(25);
        tam.setBounds(540,400,150,25);
        add(tam);
        
        
        
        //boton de empezar
        empezar= new JButton(new ImageIcon());
        empezar.setBounds(6500,400,50,50);
        empezar.setBackground(Color.WHITE);
        empezar.setForeground(Color.BLACK);
        empezar.setOpaque(true);
        empezar.setBorderPainted(false);
        empezar.setFocusable(false);
        empezar.setOpaque(false);
        add(empezar);
        
        
        
        
        
//        //imagen de fondo 
//        imagen= new JLabel(new ImageIcon("backc-radio-turquesa.jpg"));
//        imagen.setBounds(0,0,800, 400);
//        add(imagen);
        
        
    }
}
