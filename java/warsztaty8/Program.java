import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;



// g2d.draw(jakis shape)
// g2d.fill()
// g2d.setPaint(Paint/Color/GradientPaint/TexturePaint)
// g2d.SetStroke() -> grubosc linii, ciaglosc


class Plansza extends JPanel
{
   Shape figura;
 
   Plansza(Shape figura)            
   {                                
      this.figura=figura;           
   }                                
 
   public void paintComponent(Graphics g) 
   {                                      
      super.paintComponent(g);            
      Graphics2D g2d=(Graphics2D)g;   

      g2d.setColor(Color.green);
      g2d.fill(figura);
      g2d.draw(figura);
      
                         
   }                                      
}
 
public class Program
{
   public static void main(String[] args)                
   {                                                     
      Shape obj1;                                        
      obj1=new Rectangle2D.Float(100,100,140,100); 

      Shape obj2;
      obj2 = new Ellipse2D.Float.Float(200,200,50,40);     
 
      Plansza p;                                         
      p=new Plansza(obj1);
    //   p.add(obj1);
    //   p.add(obj2);
      
    //   Plansza p2;
    //   p2=new Plansza(obj2);
 
      JFrame jf=new JFrame();                            
      jf.add(p);
    //   jf.add(p2);

    //   obj2.getHeight();
      
    //   JFrame jf2=new JFrame();                            
    //   jf2.add(jf);    
 
      jf.setTitle("Test grafiki");                       
      jf.setSize(400,400);                               
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      jf.setVisible(true);        

    //   jf2.setTitle("Test grafiki");                       
    //   jf2.setSize(400,400);                               
    //   jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    //   jf2.setVisible(true);     

   }                                                     
}