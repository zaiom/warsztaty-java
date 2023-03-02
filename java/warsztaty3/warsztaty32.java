import java.io.*;

public class warsztaty32
{
    static double KURS=3.8;
    static double KURS2 = 4.7;
    public static void main(String[] args)
    {
      
        try                                                                        
        {                                                                          
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            
           System.out.print("Wybierz i wpisz EURO lub DOLAR\n");
           String str2=br.readLine();
           if (str2.equals("DOLAR"))
           {
               System.out.print("$: ");
               String str=br.readLine();
               
               double x=Double.parseDouble(str);
               System.out.println("PLN: "+x*KURS);
           }
           else if (str2.equals("EURO"))
           {
            System.out.print("EUR: ");
            String str=br.readLine();

            double x=Double.parseDouble(str);
            System.out.println("PLN: "+x*KURS2);
            }

                                    
        }                                                                          
   
        catch(IOException e1)                                                      
        {                                                                          
           System.out.println("wyjatek operacji wejscia/wyjscia");                 
        }                                                                          
   
        catch(NumberFormatException e2)                                            
        {                                                                          
           System.out.println("nieprawidlowy format liczby");                      
        } 


    }
}
