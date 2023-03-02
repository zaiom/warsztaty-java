import java.io.*;
import java.net.*;


 
public class Serwer
{
   public static final int PORT=58321;
 
   public static void main(String args[]) throws IOException                  
   {                                                                         
      //tworzenie gniazda serwerowego                                        
      ServerSocket serv;                                                     
      serv=new ServerSocket(PORT);                                           
 
      //oczekiwanie na polaczenie i tworzenie gniazda sieciowego             
      System.out.println("Nasluchuje: "+serv);                               
      Socket sock;                                                           
      sock=serv.accept();                                                    
      System.out.println("Jest polaczenie: "+sock);    
      
      System.out.println("Komunikator jest gotowy");                         
 
      //tworzenie strumienia danych pobieranych z gniazda sieciowego         
      BufferedReader inp;  
      inp=new BufferedReader(new InputStreamReader(sock.getInputStream()));  

      BufferedReader klaw;        
      klaw=new BufferedReader(new InputStreamReader(System.in)); 

      PrintWriter outp;        
      outp=new PrintWriter(sock.getOutputStream());                                  

 
      //komunikacja - czytanie danych ze strumienia 
                               
      // InputStream str1;                //read
      // OutputStream str2;               //write

      String str;  
      str = "";  
      while (true)
      {  
         if (!str.equalsIgnoreCase("KONIEC"))
         {
            inp=new BufferedReader(new InputStreamReader(sock.getInputStream()));      //czyta komunikaty
            str=inp.readLine();                                          
            System.out.println(str);
   
   
            klaw=new BufferedReader(new InputStreamReader(System.in));                 //zapisuje nowe, wysylane komunikaty, tworzenie strumieni danych pobieranych ze strumienia
            System.out.print("<Wysylamy:> ");                                                
            String str2=klaw.readLine();  
   
            outp=new PrintWriter(sock.getOutputStream());                              //wyswietla zapisane komunikaty, dostarczanie do socketu
            outp.println(str2);  
            outp.flush();              //synchronizacja ze strumieniem
         }
         
         else
         {
            //zamykanie polaczenia  
            outp.print("KONIEC POLACZENIA");                                                   
            inp.close();              //zamykamy strumien    
            klaw.close();                                                                    
            outp.close();                                         
            sock.close();                                                          
            serv.close();  
         }
                                         
      }                                                     
                           
 
                                                        
   }                                                                         
}