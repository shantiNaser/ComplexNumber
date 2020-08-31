/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javafx.scene.paint.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author macbookpro
 */


public class myArithmDialog extends JDialog implements ActionListener {
    
    
    JLabel L1,L2,R1,R2;
    JTextField T1,T2;
    JRadioButton Add,Sub,Mut,Div;
    ButtonGroup gp = new ButtonGroup();
    JButton d,clear,cancel;
    JLabel space1,space2,space3,space4,space5,space6,space7;
    
 
    
    
    myArithmDialog(JFrame F , boolean boo)
    {
        super(F);
        setTitle("Arithmetic Operation.");
        setModal(true);
       
        L1 = new JLabel("Enter First Complex Number ---> ");
        L2 = new JLabel("Enter Second Complex Number --->"); 
        T1 = new JTextField(10);
        T2 = new JTextField(10); 
        space1 = new JLabel("                                                                    ");
        space2 = new JLabel("                                                                    ");
        space3 = new JLabel("                                 ");
        space4 = new JLabel("                                 ");
        space5 = new JLabel("                                                                                                                                                                   ");
        space6 = new JLabel("                                                                                                                     ");
        space7 = new JLabel("");

        
        
        Add = new JRadioButton("Add               ",true);
        Sub = new JRadioButton("Subtract");
        Mut = new JRadioButton("Multiply");
        Div = new JRadioButton("Divide");
        
        d = new JButton("Do It");
        clear = new JButton("Clear");
        cancel = new JButton("Cancel");
        
        
     
       setLayout( new FlowLayout());
    
       add(L1);
       add(T1);
       add(L2);
       add(T2);  
      
      
      add(space6);
     
                
   
      
        
        T1.addActionListener(this);
        T2.addActionListener(this);
        
      
    
        
        Box verticalBox = Box.createVerticalBox();
        

        
        

        verticalBox.add(Add);
        verticalBox.add(Sub);
        verticalBox.add(Mut);
        verticalBox.add(Div);

        gp.add(Add);
        gp.add(Sub);
        gp.add(Mut);
        gp.add(Div);


 
        add(verticalBox);
   
     

     add(space2);
     add(space1);
        

        
        
        
        verticalBox.setBorder(BorderFactory.createTitledBorder("Select Operation"));
        
        Add.addActionListener(this);
        Sub.addActionListener(this);
        Mut.addActionListener(this);
        Div.addActionListener(this);
        
        
        R1 = new JLabel("                                                                                     ");
        add(R1);
        
        
        add(space3);
        add(space4);
        add(space5);
        
        
        add(d);
        add(clear);
        add(cancel);
        
        d.addActionListener(this);
        clear.addActionListener(this);
        cancel.addActionListener(this);
        
        
       
        
        
        
        
        
        
        // Decoration 
        setResizable(false);
        setBounds(600,300,500,400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        
        
    }
    

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == d)
      {
         
         Add.doClick();
        
      }
      
      
    else  if(e.getSource()==clear)
      {
          T1.setText(null);
          T2.setText(null);
          R1.setText("Choose any Operation and input Two complex number");
          R1.setForeground(java.awt.Color.red);
          
     
      }
      
    else  if(e.getSource()==cancel)
      {
          dispose();
      }
      
      
      
   else   if(e.getSource() == Add)
      {
          String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
              
          ComplexNum num1 = new ComplexNum(T1.getText());
          ComplexNum num2 = new ComplexNum(T2.getText());
          
        
          ComplexNum Res = new ComplexNum();
          Res = Res.Sum(num1, num2);
          
          R1.setText("the result of Adding Both Number is -------->" + (Res.real) + "+" + (Res.imaginary)+"i");
          R1.setForeground(java.awt.Color.black);
          }
          else if(!g1.isEmpty()||!g2.isEmpty())
              
          {
         R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
          }
          else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
          }
      }
      
      
   else if(e.getSource()==Sub)
   {
       String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
       ComplexNum num1 = new ComplexNum(T1.getText());
       ComplexNum num2 = new ComplexNum(T2.getText());
       
       ComplexNum Res = new ComplexNum();
       Res = Res.Sub(num1, num2);
       
       
       R1.setText("the result of Subtraction Both Number is --->" + (Res.real) + "-" + (Res.imaginary)+"i"  );
      R1.setForeground(java.awt.Color.black);
          }
          else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
          }
          
   }
   
   
   
   else if(e.getSource()==Mut)
   {
       String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
       
       ComplexNum num1 = new ComplexNum(T1.getText());
       ComplexNum num2 = new ComplexNum(T2.getText());
       
       ComplexNum Res = new ComplexNum();
       Res = Res.Mut(num1, num2);
       
       if(Res.imaginary>=0)
       {
         
       R1.setText("the result of Multipliction Both Number is --->" + (Res.real) + "+" + (Res.imaginary)+"i"  );
       R1.setForeground(java.awt.Color.black);
          }
       else
       {
        R1.setText("the result of Multipliction Both Number is --->" + (Res.real) + "" + (Res.imaginary)+"i"  ); 
        R1.setForeground(java.awt.Color.black);
       }
          }
       else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
          }  
      
       
   }
      
      
   else if(e.getSource()==Div)
   {
       
       String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
       ComplexNum num1 = new ComplexNum(T1.getText());
       ComplexNum num2 = new ComplexNum(T2.getText());
       
       if(num2.real == 0 && num2.imaginary==0)
       {
           R1.setText("                 Devision by 0 + 0i is not allowed");
       R1.setForeground(java.awt.Color.magenta);
       }
       else
       {
           double x ,y,z;
           x=num1.real*num2.real + num1.imaginary*num2.imaginary;
           y=num1.imaginary*num2.real - num1.real*num2.imaginary;
           z=num2.real*num2.real + num2.imaginary*num2.imaginary;
           
           if(x%z ==0 && y%z ==0)
           {
               if(y/z>=0)
               {
                   R1.setText("the result of Division Both Number is --->" + (x/z) + "+" + (y/z) + "i" );
                   R1.setForeground(java.awt.Color.black);
               }
               else
               {
                   R1.setText("the result of Multipliction Both Number is --->" + (x/z) + "" + (y/z) + "i" );
                    R1.setForeground(java.awt.Color.black);
               }
           }
           
           else if(x%z==0 && y%z !=0)
           {
               if(y/z >=0)
               {
                  R1.setText("the result of Division Both Number is --->" + (x/z) + "+" + (y)+"/"+(z) + "i" );
                   R1.setForeground(java.awt.Color.black);
               }
               else
                   
               {
                 R1.setText("the result of Division Both Number is --->" + (x/z) + "" + (y)+"/"+(z) + "i" ); 
                  R1.setForeground(java.awt.Color.black);
               }
           }
           
           else if(x%z!=0 && y%z ==0)
           {
               if(y/z>=0)
               {
                  R1.setText("the result of Division Both Number is --->" + (x)+ "/" + (z) + "+" + (y/z) + "i" );
                   R1.setForeground(java.awt.Color.black);
               }
               
               else
               {
                   R1.setText("the result of Division Both Number is --->" + (x)+ "" + (z) + "/" + (y/z) + "i" ); 
                    R1.setForeground(java.awt.Color.black);
               }
               
           }
           else
           {
               if(y/z >=0)
               {
                 R1.setText("the result of Division Both Number is --->" + (x)+ "/" + (z) + "+" + (y) +"/" + (z) + "i" );  
                  R1.setForeground(java.awt.Color.black);
               }
               else
               {
                  R1.setText("the result of Division Both Number is --->" + (x)+ "/" + (z) + "" + (y) +"/" + (z) + "i" ); 
                   R1.setForeground(java.awt.Color.black);
               }
           }
       }
   
   }
          
       else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
          }     
      
      
      
    }
    
    
}

   
}
