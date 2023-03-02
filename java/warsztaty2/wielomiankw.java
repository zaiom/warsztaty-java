class Punkt
{
   double x;
   double y;
 
   Punkt(double x,double y) 
   {                        
      this.x=x;             
      this.y=y;             
   }   
   
   public String toString()          
   {                                 
      return "[x: "+x+", y: "+y+"]"; 
   }                                 
}


class WielomianKwadratowy
{
    double a;
    double b;
    double c;

    WielomianKwadratowy(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    WielomianKwadratowy dodaj(WielomianKwadratowy obj)
    {
        double aa,bb,cc;
        aa = this.a + obj.a;
        bb = this.b + obj.b;
        cc = this.c + obj.c;
        return new WielomianKwadratowy(aa,bb,cc);
    }

    WielomianKwadratowy odejmij(WielomianKwadratowy obj)
    {
        double aa,bb,cc;
        aa = this.a - obj.a;
        bb = this.b - obj.b;
        cc = this.c - obj.c;
        return new WielomianKwadratowy(aa,bb,cc);
    }

    // WielomianKwadratowy pomnoz(WielomianKwadratowy obj)
    // {
    //     double aa,bb,cc;
    //     aa = this.a + obj.a;
    //     bb = this.b + obj.b;
    //     cc = this.c + obj.c;
    //     return new WielomianKwadratowy(aa,bb,cc);
    // }

    Punkt miejsceZerowe()
    {
        double x0,x1,x2;
        double delta;
        delta = Math.pow(this.b, 2) - 4*a*c;

        if (delta >0)
        {
            x1 = (-this.b - Math.sqrt(delta))/(2*a);
            x2 = (-this.b + Math.sqrt(delta))/(2*a);

            return new Punkt(x1,0);
            // return new Punkt(x2,0);
            
        }
        else if (delta == 0)
        {
            x0 = (-b)/(2*a);
            return new Punkt(x0,0);
        }
        else
        {
            return new Punkt(0,0);          // brak miejsc zerowych
        }
    }
    public String toString()
    {
        if (b>0 && c>0)
        {
            return a + "x**2 + " + b + "x + " + c;
        }
        else if (b<0 && c>0)
        {
            return a + "x**2 " + b + "x + " + c;
        }
        else
        {
            return a + "x**2 + " + b + "x " + c;
        }
        
    } 

}


public class wielomiankw 
{
    public static void main(String[] args)
    {
        WielomianKwadratowy w1, w2;
        w1 = new WielomianKwadratowy(5,7,11);
        w2 = new WielomianKwadratowy(2,6,4);
        System.out.println(w1);
        System.out.println(w2);

        WielomianKwadratowy w3 = w1.dodaj(w2);
        System.out.println(w3);

        WielomianKwadratowy w4 = w1.odejmij(w2);
        System.out.println(w4);

        // WielomianKwadratowy w5 = w1.pomnoz(w2);
        // System.out.println(w5);

        Punkt w6 = w1.miejsceZerowe();
        System.out.println(w6);

    }

}
    
