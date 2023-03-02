import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class Demo implements ActionListener
{
   JTextField t1;
   JButton kwadrat;
   JButton clear;
   JButton plus;
   JButton equals;
   int equation_1 = 0;
   char last_operation;
 
   public void actionPerformed(ActionEvent e)  
   {                                           
      Object target = e.getSource();           
      
      if(target==kwadrat||target==t1)               
      {                                        
         int k=Integer.parseInt(t1.getText()); 
         t1.setText(Integer.toString(k*k));    
         t1.requestFocus();                    
      }                                        
      else if (target==clear){                                        
         t1.setText("");
         equation_1 = 0;                    
         t1.requestFocus();                
      }
      else if (target == plus){
         int k = Integer.parseInt(t1.getText());
         equation_1 += k;
         last_operation = '+';
         t1.setText("");
         t1.requestFocus();
      }
      else if (target == equals){
         if (last_operation == '+') {
            int k = Integer.parseInt(t1.getText());
            equation_1 += k;
         }
         else {
            t1.requestFocus();
            return;
         }
         t1.setText(Integer.toString(equation_1));
         t1.requestFocus();                    
      }
   }                                           
 

   void init()                                          
   {                                                    
      t1=new JTextField(6);                             
      kwadrat=new JButton("^2");                             
      clear=new JButton("clear"); 
      plus=new JButton("+"); 
      equals=new JButton("=");                                                                            
 
      JPanel p=new JPanel();                            
      p.add(t1);                                        
      p.add(kwadrat);                                        
      p.add(clear);
      p.add(plus);
      p.add(equals);

 
      t1.addActionListener(this);                    
      kwadrat.addActionListener(this);                       
      clear.addActionListener(this);
      plus.addActionListener(this);
      equals.addActionListener(this);
 
      JFrame f=new JFrame();                            
      Container c=f.getContentPane();                   
      c.add(p);                                         
      f.pack();                                         
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      f.setVisible(true);                               
   }                                                    
 
   public static void main(String[] args) throws NumberFormatException  
   {                                               
      //do wersji 1.4                              
      //new Demo().init();                         
 
      //od wersji 1.5                              
      SwingUtilities.invokeLater(new Runnable()    
      {                                            
         public void run()                         
         {                                         
            new Demo().init();                     
         }                                         
      });                                          
   }                                               
}