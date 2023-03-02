import java.io.*;
import java.net.*;



public class Klient
{
   public static final int PORT=58321;
   public static final String HOST = "127.0.0.1";
 
   public static void main(String[] args) throws IOException                            
   {                                                                                   
      //nawiazanie polaczenia z serwerem                                               
      Socket sock;                                                                     
      sock=new Socket(HOST,PORT);                                                      
      System.out.println("Nawiazalem polaczenie: "+sock);      
      
      System.out.println("Komunikator jest gotowy");  
 
      //tworzenie strumieni danych pobieranych z klawiatury i dostarczanych do socketu 
      BufferedReader klaw;                                                             
      klaw=new BufferedReader(new InputStreamReader(System.in));   

      PrintWriter outp;                                                                
      outp=new PrintWriter(sock.getOutputStream());         
      
      BufferedReader inp;   
       inp=new BufferedReader(new InputStreamReader(sock.getInputStream()));  

      //komunikacja - czytanie danych z klawiatury i przekazywanie ich do strumienia   
                                                 
      String str;  
      str = "";  
      while (true)
      {  
         if (!str.equalsIgnoreCase("KONIEC"))
         {

            klaw=new BufferedReader(new InputStreamReader(System.in));                 //zapisuje nowe, wysylane komunikaty
            System.out.print("<Wysylamy:> ");                                                
            String str2=klaw.readLine();  
   
            outp=new PrintWriter(sock.getOutputStream());                              //wyswietla zapisane komunikaty
            outp.println(str2);  
            outp.flush();              //synchronizacja ze strumieniem

            inp=new BufferedReader(new InputStreamReader(sock.getInputStream()));      //czyta komunikaty
            str=inp.readLine();                                          
            System.out.println(str);
   
   

         }
         
         else
         {
            //zamykanie polaczenia                                                 
            inp.close();              //zamykamy strumien    
            klaw.close();                                                                    
            outp.close();                                         
            sock.close();                                                          
         }
                                         
      }                                                     
                                                                         
   }                                                                         
}