package complexnumber;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author macbookpro
 */
public class mySecDialog extends JDialog implements ActionListener{
    
    
    JLabel L1,L2,R1,R2;
    JTextField T1,T2;
    JRadioButton equal,GT,LT,Valid;
    ButtonGroup gp = new ButtonGroup();
    JButton d,clear,cancel;
    
    
    JLabel space1,space2,space3,space4,space5,space6,space7;
 
    
    
    mySecDialog(JFrame F , boolean boo)
    {
        super(F);
        setTitle("Logical Operation.");
        setModal(true);
        
       
        
        L1 = new JLabel("Enter First Complex Number ---> ");
        L2 = new JLabel("Enter Second Complex Number --->"); 
        T1 = new JTextField(10);
        T2 = new JTextField(10); 
        space1 = new JLabel("                                                                                               ");
        space2 = new JLabel("                                                                    ");
        space3 = new JLabel("                                       ");
        space4 = new JLabel("                                 ");
        space5 = new JLabel("                                                                                                                                                                   ");
        space6 = new JLabel("                                                                                                                     ");
        space7 = new JLabel("");
        

        
        
        equal = new JRadioButton("Equal               ",true);
        GT = new JRadioButton("Greater Than");
        LT = new JRadioButton("Less Than");
        Valid = new JRadioButton("Invalid Check Input ");
        
        d = new JButton("Compare");
        clear = new JButton("Clear");
        cancel = new JButton("Cancel");
        
        
        setLayout( new FlowLayout());
        
       add(L1);
       add(T1);
       add(L2);
       add(T2);  
      
      
      add(space6);
      
    
    
   
   
  Box verticalBox = Box.createVerticalBox();
        
    
        
        
      
        verticalBox.add(equal);
        verticalBox.add(GT);
        verticalBox.add(LT);
        verticalBox.add(Valid);
    
        gp.add(equal);
        gp.add(GT);
        gp.add(LT);
        gp.add(Valid);


   
        add(verticalBox);

     

     add(space2);
     add(space1);
  
  


      
        
        T1.addActionListener(this);
        
      
        
        
     verticalBox.setBorder(BorderFactory.createTitledBorder("Select Operation"));
        
        equal.addActionListener(this);
        GT.addActionListener(this);
        LT.addActionListener(this);
        Valid.addActionListener(this);
        
        
        R1 = new JLabel("");
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
    
       
    
        
        verticalBox.setBorder(BorderFactory.createTitledBorder("Select Operation"));
        
        equal.addActionListener(this);
        GT.addActionListener(this);
        LT.addActionListener(this);
        Valid.addActionListener(this);
        
        
   
        
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
    
      
      if(e.getSource()==clear)
      {
          
          T1.setText(null);
          T2.setText(null);
          R1.setText(null);
      }
      
      if(e.getSource()==cancel)
      {
          dispose();
      }
      
      if(e.getSource()==d)
      {
          equal.doClick();
      }
      
      
      
      if(e.getSource() == equal)
      {
          
          String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
          ComplexNum num1 = new ComplexNum(T1.getText());
          ComplexNum num2 = new ComplexNum(T2.getText());
          
          
          if(((num1.real== num2.real) && (num1.imaginary == num2.imaginary)))
          {
              R1.setText("yes.. ---> 2 numbers are equal");
               R1.setForeground(java.awt.Color.black);
          }
          else
          {
               R1.setText("No.. ---> 2 numbers are not equal ");
                R1.setForeground(java.awt.Color.black);
          }
          
          }
          
           else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
   
      }
 
      
    }
      
      
      //It is possible to order the complex numbers. For instance, one could define 𝑥1+𝑖𝑦1<𝑥2+𝑖𝑦2 if 𝑥1<𝑥2 or if 𝑥1=𝑥2 and 𝑦1<𝑦2.
      
      
      
      else if (e.getSource() == GT)
      {
         String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
              ComplexNum num1 = new ComplexNum(T1.getText());
              ComplexNum num2 = new ComplexNum(T2.getText());
              
              if(((num1.real== num2.real) && (num1.imaginary == num2.imaginary)))
              {
                  R1.setText("the Two numbers are equal");
                  R1.setForeground(java.awt.Color.black);
              }
              
              
              
            else  if(num2.real>num1.real || ((num1.real == num2.real)&&(num2.imaginary>num1.imaginary)))
              {
                  R1.setText("the Secand Number is Greater Than First number");
                  R1.setForeground(Color.black);
              }
              else
                      {
                          R1.setText("the First Number is Greater Than Secand number");
                          R1.setForeground(Color.black);
                      }
              
          } 
           else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
   
          }
  
      }
      
      
      
      
      
      else if (e.getSource() == LT)
      {
         String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
              ComplexNum num1 = new ComplexNum(T1.getText());
              ComplexNum num2 = new ComplexNum(T2.getText());
              
              if(((num1.real== num2.real) && (num1.imaginary == num2.imaginary)))
              {
                  R1.setText("the Two numbers are equal");
                  R1.setForeground(java.awt.Color.black);
              }
              
              
              
            else  if(num2.real>num1.real || ((num1.real == num2.real)&&(num2.imaginary>num1.imaginary)))
              {
                  R1.setText("the First Number is Less Than Secand number");
                  R1.setForeground(Color.black);
              }
              else
                      {
                          R1.setText("the Secand Number is Less Than First number");
                          R1.setForeground(Color.black);
                      }
              
          } 
           else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
   
          }
  
      }
      
      
      
      else if(e.getSource()==Valid)
      {
         
          String g1 = T1.getText();
          String g2 = T2.getText();
          if(!g1.isEmpty()&&!g2.isEmpty())
          {
              
            if(isC(g1.charAt(0))&&isC(g2.charAt(0)))
            {
                R1.setText("Sory,. The First and Secand Numer is InValid");
            }
           else
            {
                
                ComplexNum num1 = new ComplexNum(T1.getText());
                ComplexNum num2 = new ComplexNum(T2.getText());
                R1.setText("The input is Valid, You Can Do any Thing");
                
            }
          }
        else if(g1.isEmpty()&&g2.isEmpty())
          {
              R1.setText("An Importent Filed does not implemented ");
        R1.setForeground(java.awt.Color.red);
   
          }
      }
    }
  
        
     

    
    
    public boolean isC(char c)
    {
        return (!Character.isDigit(c));
 
}
}
    
    
