class Punkt
{
   double x;
   double y;
 
   Punkt(double x,double y) 
   {                        
      this.x=x;             
      this.y=y;             
   }   
   
   void przesun(double dx, double dy)
   {
    //    this.dx=dx;
    //    this.dy=dy;
       x=x+dx;
       y=y+dy;
   }
 
   public String toString()          
   {                                 
      return "[x: "+x+", y: "+y+"]"; 
   }                                 
}

class Prostokat
{
   double dlugosc;
   double szerokosc;
   Punkt wierzcholek;
 
   Prostokat(double dlugosc,double szerokosc) 
   {                                          
      this.dlugosc=dlugosc;                   
      this.szerokosc=szerokosc;               
      this.wierzcholek=new Punkt(0,0);        
   }                                          
 
   Prostokat(double dlugosc,double szerokosc, Punkt wierzcholek) 
   {                                                             
      this.dlugosc=dlugosc;                                      
      this.szerokosc=szerokosc;                                  
      this.wierzcholek=wierzcholek;                              
   }  

   double pole()                
   {                            
      return dlugosc*szerokosc; 
   }    

   void przesun(double u, double v)
   {
       wierzcholek.przesun(u,v);
       
   }
   
   boolean zawiera(Punkt obj)
   {
      double d;
      double c;
      d = Math.sqrt(Math.pow((obj.x - wierzcholek.x),2) + Math.pow((obj.y - wierzcholek.y),2));
      c = Math.sqrt(Math.pow((dlugosc/2),2) + Math.pow((szerokosc/2),2));
       
      if (d < c) 
      {
         return true;
      }
      else 
      {
         return false;
      }
   }

   boolean przecina(Okrag obj)
   {
      double d;
      double c;
      d = Math.sqrt(Math.pow((obj.srodek.x - wierzcholek.x),2) + Math.pow((obj.srodek.y - wierzcholek.y),2));
      c = Math.sqrt(Math.pow((dlugosc/2),2) + Math.pow((szerokosc/2),2));

      if (d < c && d < obj.promien)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
 
   public String toString()                                                   
   {                                                                          
      return "[dl: "+dlugosc+", sz: "+szerokosc+"]" + wierzcholek.toString(); 
   }                                                                          
 
  
}

class Okrag
{
    double promien;
    Punkt srodek;

    Okrag(double promien)
    {
        this.promien = promien;
        this.srodek = new Punkt(0,0);
    }

    Okrag(double promien, Punkt srodek)
    {
        this.promien = promien;
        this.srodek = srodek;
    }

    double pole()
    {
        return Math.PI*Math.pow(promien,2);
    }

    double dlugosc()
    {
        return Math.PI*2*promien;
    }

    boolean zawiera(Punkt obj)
    {
      double d;
      // boolean b1;
      d = Math.sqrt(Math.pow((obj.x - srodek.x),2) + Math.pow((obj.y - srodek.y),2));
   
      
      if (d < promien) 
      {
         // b1 = true;
         return true;
      }
      else 
      {
         // b1 = false;
         return false;
      }
    }

    boolean przecina(Okrag obj)
    {
       double d;
       d = Math.sqrt(Math.pow((obj.srodek.x - srodek.x),2) + Math.pow((obj.srodek.y - srodek.y),2));

       if (d < (promien + obj.promien))
       {
          return true;
       }
       else
       {
          return false;
       }
    }

    public String toString()
    {
        return "[promien: "+promien+", srodek: "+srodek+"]";
    }
}

public class Program2  

{
    public static void main(String[] args)
       {                                          
      //  Punkt obj1;                             
      //  obj1=new Punkt(-1,1);                   
      //  System.out.println("punkt: "+obj1);     
  
      //  Prostokat da;                         
      //  da=new Prostokat(3,4,obj1);           
      //  System.out.println("prostokat: "+da); 
  
    //    double p=da.pole();                   
    //    System.out.println("pole: "+p); 
       
       Punkt obj;
       obj = new Punkt(2,1);
       System.out.println(obj);

      //  Punkt obj2;
      //  obj2 = new Punkt(4,3);
      //  System.out.println(obj2);
        
      //  obj.przesun(-1,3);
      //  System.out.println(obj);
              
      //  Prostokat obj2;
      //  obj2=new Prostokat(3,4,obj);
      //  System.out.println(obj2);
        
      //  obj2.przesun(7,-3);
      //  System.out.println(obj2);
       
       Okrag k1;
       k1 = new Okrag(3, new Punkt(1,3));
       System.out.println("Okrag: "+k1);

      //  Okrag k2;
      //  k2 = new Okrag(2, new Punkt(5,6));
      //  System.out.println("Okrag: "+k2);

      //  double pole=k.pole();
      //  System.out.println("pole: "+pole);

      //  double o=k.dlugosc();
      //  System.out.println("obwod: "+o);

       boolean j=k1.zawiera(obj);
       System.out.println(j);

      //  boolean j2=k2.zawiera(obj2);
      //  System.out.println(j2);

      //  boolean j3=da.zawiera(obj);
      //  System.out.println(j3);

      // boolean j4 = k1.przecina(k2);
      // System.out.println(j4);

      // boolean j5 = da.przecina(k1);
      // System.out.println(j5);

    }                                          
 }
