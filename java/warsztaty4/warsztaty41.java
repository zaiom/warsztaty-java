import java.awt.Rectangle;

class Prostokat extends Rectangle
{
   Prostokat(int a,int b) 
   {                      
      super(a,b);         
   }                      
 
   void info()                  
   {                            
      System.out.println(this); 
   }                            
}

public class warsztaty41
{
   public static void main(String[] args)                   
   {                                                       
 
      Prostokat a=new Prostokat(3,4);                      
      a.info();                                            
 
      Prostokat b=new Prostokat(2,2);                      
      b.info();                                            
 
 
 
      if(a.intersects(b))                                  
      {                                                    
         System.out.println("-- przecinaja sie --\n");     
      }                                                    
      else                                                 
      {                                                    
         System.out.println("-- NIE przecinaja sie --\n"); 
      }                                                    
 
 
 
      a.translate(5,3);                                    
      a.info();                                            
 
      if(a.intersects(b))                                  
      {                                                    
         System.out.println("-- przecinaja sie --\n");     
      }                                                    
      else                                                 
      {                                                    
         System.out.println("-- NIE przecinaja sie --\n"); 
      }                                                    
 
   }                                                       
}