/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author estudiantes
 */
public class Menu extends JFrame{
    JLabel subt = new JLabel("¿Que desea realizar?");
    JButton res = new JButton("Reserva");
    JButton checkin = new JButton("Check-In");
    JButton checkout = new JButton("Check-out");
    JButton pedirProd = new JButton("Solicitar producto o servicio");

    public Menu(){
        Container c = getContentPane();
        c.setLayout(null);
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        c.add(subt);
        subt.setBounds(90, 15, 200, 30);
        c.add(res);
        res.setBounds(100,50,100,25);
        c.add(checkin);
        checkin.setBounds(100,90,100,25);
        c.add(checkout);
        checkout.setBounds(100,130,100,25);
        c.add(pedirProd);
        pedirProd.setBounds(55,170,200,25);       
    }
    public void mostrar(){
        setSize(350,300);
        setVisible(true);
        
    }
    
    
    
}
