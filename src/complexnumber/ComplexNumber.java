/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Complex_GUI extends JFrame implements ActionListener
{
    
    JMenu F,O;
    JMenuItem E,A,L;
    
    
    
    
    public Complex_GUI()  // --> Constructer
    {
        
        
        super("Welcome to Complex Number Operations..");
        setIconImage(new ImageIcon("Icons/calculator.png").getImage());
        
       Img panel = new Img(
        new ImageIcon("Icons/Intro2.png").getImage());
       getContentPane().add(panel);
       pack();
       setVisible(true);
       

    
        
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        
        F = new JMenu("File");
        O = new JMenu("Operation");
        E = new JMenuItem("exit");
        A = new JMenuItem("Arithmetic");
        L = new JMenuItem("Logical");
        
        bar.add(F);
        bar.add(O);
        
        F.add(E);
        E.setIcon(new ImageIcon("Icons/logout.png"));
        O.add(A);
        A.setIcon(new ImageIcon("Icons/math.png"));
        O.add(L);
        L.setIcon(new ImageIcon("Icons/logic.png"));
        
        E.addActionListener(this);
        A.addActionListener(this);
        L.addActionListener(this);
        
        
        
        
           setBounds(400,100,575,440);
          
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()== E)
            dispose();
       
       else if (e.getSource()==A)
          new myArithmDialog(this,true);
       
       
       else if(e.getSource()==L)
           new mySecDialog(this,true);
           
        
    }
    
    
    
}


public class ComplexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        new Complex_GUI();
     
      
        
        
    }
    
    
       
}
