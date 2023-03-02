import java.lang.String;

class Osoba
{
    String nazwisko;

    Osoba(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
}

interface Przeszukiwalne
{
   boolean czyPasuje(String wzorzec);

}

abstract class Dokument implements Przeszukiwalne
{
    abstract boolean czyPasuje();

}

class Paszport extends Dokument
{
   public boolean czyPasuje(String wzorzec) 
   {                                        
      return false;                         
   }                                        
 
   public String toString() 
   {                        
      return "";            
   }                        
}

class DowodOsobisty extends Dokument
{
   public boolean czyPasuje(String wzorzec) 
   {                                        
      return false;                         
   }                                        
 
   public String toString() 
   {                        
      return "";            
   }                        
}

public class warsztaty45 
{
    public static void main(String[] args)                                        
    {                                                                             
       Dokument[] bazaDanych={new Paszport(),new DowodOsobisty(),new Paszport()}; 
  
       Dokument z;                                                                
       String wzorzec="Gorniak";                                                  
  
       for(int i=0;i<bazaDanych.length;i++)                                       
       {                                                                          
          z=bazaDanych[i];                                                        
          if(z.czyPasuje(wzorzec))System.out.println("znaleziono: "+z);  
          
       }   
       
    //    Osoba o1 = new Osoba("Dariusz","Szpakowski",31);
       
    }                                                                             
 }
