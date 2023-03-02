class Prostokat
{
   double dlugosc;
   double szerokosc;
 
   Prostokat()            
   {                      
      this.dlugosc=0.0;   
      this.szerokosc=0.0; 
   }                      
 
   Prostokat(double dlugosc,double szerokosc)  
   {                                          
      this.dlugosc=dlugosc;                   
      this.szerokosc=szerokosc;               
   }                                          
 
   double pole()                
   {                            
      return dlugosc*szerokosc; 
   }                           
   
   double obwod()
   {
      return 2*dlugosc + 2*szerokosc;
   }
}

public class Program
{
   public static void main(String[] args)         
   {                                             
      Prostokat obj;                             
      obj=new Prostokat(3,4);                    
      double x=obj.pole();            
      double y=obj.obwod();
      
 
      System.out.println("Pole prostokata: " + x + "\nObwod prostokata: " + y);
      // System.out.println("Obwod prostokata: "+y);  
   }                                             
}