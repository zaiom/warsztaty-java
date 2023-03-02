import java.io.*;

class Prostokat
{
    int dlugosc;
    int szerokosc;
    int x;
    int y;

    // Prostokat()
    // {
    //     this.dlugosc = 0;
    //     this.szerokosc = 0;
    //     this.x = 0;
    //     this.y = 0;
    // }

    Prostokat(int dlugosc, int szerokosc, int x, int y)
    {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.x = x;
        this.y = y;
    }

    public String toString()          
    {                                 
       return "Dlugosc: " + dlugosc + "\nSzerokosc: " + szerokosc + "\nWspolrzedne: ("+x+","+y+")";   
    }

    void save(String plik)
    {
        try
        {
            PrintWriter plik1 = new PrintWriter(new BufferedWriter(new FileWriter(plik,true))); 
            plik1.println("Dlugosc: " + dlugosc + "\nSzerokosc: " + szerokosc + "\nWspolrzedne: ("+x+","+y+")");   
            plik1.println(dlugosc+szerokosc+x+y);                                                       
            plik1.close(); 
        }
        catch(Exception e){System.out.println(e);} 
       
    }
     
}


public class warsztaty34 
{
    public static void main(String[] args)                                                        
   {
       Prostokat obj = new Prostokat(1,2,3,4);
       obj.save("pliczek.txt");
   }   

}
