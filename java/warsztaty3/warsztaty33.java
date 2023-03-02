import java.io.*;

class Prostokat
{
    int dlugosc;
    int szerokosc;
    int x;
    int y;

    Prostokat()
    {
        this.dlugosc = 0;
        this.szerokosc = 0;
        this.x = 0;
        this.y = 0;
    }

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

//     void save(String plik)
//     {
//         PrintWriter plik1 = new PrintWriter(new BufferedWriter(new FileWriter("plik2.txt",true))); 
//         plik1.println("Dlugosc: " + dlugosc + "\nSzerokosc: " + szerokosc + "\nWspolrzedne: ("+x+","+y+")");   
//         plik1.println(dlugosc+szerokosc+x+y);                                                       
//         plik1.close(); 
//     }
}

public class warsztaty33
{
   public static void main(String[] args)                                                        
   {                                                                                             
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));                    
 
      try                                                                                        
      {                                                                                          
         System.out.print("imie: ");                                                             
         String imie=br.readLine();                                                              
         System.out.print("nazwisko: ");                                                         
         String nazwisko=br.readLine();                                                          
 
         PrintWriter plik1=new PrintWriter(new BufferedWriter(new FileWriter("plik.txt",true))); 
         plik1.println(imie+" "+nazwisko);                                                       
         plik1.close();                                                                          
      }                                                                                          
      catch(Exception e){System.out.println(e);}                                                 
 
 
 
      System.out.println("\n-- z pliku --");                                                     
 
      try                                                                                        
      {                                                                                          
         BufferedReader plik2=new BufferedReader(new FileReader("plik.txt"));                    
         String str;                                                                             
 
         while(plik2.ready())                                                                    
         {                                                                                       
            str=plik2.readLine();                                                                
            System.out.println(str);                                                             
         }                                                                                       
 
         plik2.close();                                                                          
      }                                                                                          
      catch(Exception e){System.out.println(e);}             
      
      // Prostokat obj = new Prostokat(1,2,3,4);
      // System.out.println(obj);

   }                                                                                             
}