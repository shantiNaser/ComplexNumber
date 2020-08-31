/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;


public class ComplexNum {
    
    double real;
    double imaginary;
   char operation;
    
    public ComplexNum()
    {
        this.real=0;
        this.imaginary=0;
    }
   
  public ComplexNum(String num)
    {
        
       Split1(num); 

    }
    
  
    
    
    
    public void Split1(String n)
    {
        String temp="";
        String temp1="";
        String str="";
        String str2="";
        
               
        for(int i=0;i<n.length();i++)
        {
           
            if(n.charAt(i)=='-')
            {
                    
                {
                    char c=n.charAt(i);
                     str = String.valueOf(c); 
                    temp=temp+str;
                    n.charAt(i++);
                }
                
                while(!isOpe(n.charAt(i)))
                {
                    char c=n.charAt(i);
                     str = String.valueOf(c); 
                    temp=temp+str;
                    n.charAt(i++);
                }
                
                
                  if(isOpe(n.charAt(i)))
                {
                    if(n.charAt(i)=='-'||n.charAt(i)=='+')
                    {
                    char q=n.charAt(i);
                    str2 = String.valueOf(q); 
                    temp1=temp1+str2; 
                    n.charAt(i++);
                    }
                
                    
                    
                    while(!isImaginary(n.charAt(i)))
                    {
                      //  n.charAt(i++);
                        char q=n.charAt(i);
                        str2 = String.valueOf(q); 
                         temp1=temp1+str2; 
                         n.charAt(i++);
                        
                        
                    }
                
                
                }
                
            }
            
           
             
            
            else 
            {
                if((n.charAt(i))!='-')
                
                    
                    while(!isOpe(n.charAt(i)))
                    {
                    char c=n.charAt(i);
                    str = String.valueOf(c); 
                    temp=temp+str;
                    n.charAt(i++);
                    }

                   
                    
                    
                    if(isOpe(n.charAt(i)))
                {
                    if(n.charAt(i)=='-'||n.charAt(i)=='+')
                    {
                    char q=n.charAt(i);
                    str2 = String.valueOf(q); 
                    temp1=temp1+str2; 
                    n.charAt(i++);
                    }
                    
                    while(!isImaginary(n.charAt(i)))
                    {
                      //  n.charAt(i++);
                        char q=n.charAt(i);
                        str2 = String.valueOf(q); 
                         temp1=temp1+str2; 
                         n.charAt(i++);
                        
                        
                    }
                
                }
                }
        }
                
            
        double n1 = Double.valueOf(temp);
        double n2 = Double.valueOf(temp1);
        
        this.real=n1;
        this.imaginary=n2;
        this.operation=operation;
        
        
     
        
        }
    
    
  
    
    
    
  public  boolean isOpe(char O)
{
if(O=='+'||O=='-'||O=='*'||O=='/')
    return true;
return false;
    
}
 
  
  public  boolean NoMin(char O)
{
if(O=='+'||O=='*'||O=='/')
    return true;
return false;
    
}
  
  
  
 public  boolean isImaginary (char O)
 {
     if(O=='i'||O=='I')
         return true;
     return false;
 }
 
 public boolean isChar(char O)
 {
    return Character.isDigit(O);
 }
 
 
 
 
 
 
 public ComplexNum Sum(ComplexNum c1, ComplexNum c2)
 {
    ComplexNum temp = new ComplexNum();
   
    temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;
    temp.operation=operation;
 
    return temp;
 }
 
 
 
 
 public ComplexNum Sub(ComplexNum c1, ComplexNum c2)
 {
    ComplexNum temp = new ComplexNum();
   
    temp.real = c1.real - c2.real;
    temp.imaginary = c1.imaginary - c2.imaginary;
    temp.operation=operation;
  
    return temp;
 }
 
 
 public ComplexNum Mut(ComplexNum c1, ComplexNum c2)
 {
    ComplexNum temp = new ComplexNum();
   
    temp.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
    temp.imaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;
    temp.operation=operation;
  
    return temp;
 }
 
 
// Div is implemented in the ActionPerformed Directally
 
 // equal is implemented in the ActionPerformed Directally
 
 
 
 
 
 
 
 
 @Override
  public String toString()
    {
        return("Im Complex Number" );
    }

 
}
 
 
 