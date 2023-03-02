class BigLiczba 
{
    int liczba;

    BigLiczba(int liczba)
    {
        this.liczba = liczba;
    }

    public String toString(){
        return "liczba:" + liczba;
    }
    
    String podzielna(int zmienna)
    {
        if (liczba % zmienna == 0)
        {
        return "true"; 
        }
        return "false";
    }
    int count;
    String pierwsza()
    {
        for(int i = 1; i < liczba; i++)
        {
            if(liczba%i == 0)
            {
            count += 1;
            }
        }
        if(count == 1)
        {
            return "jest liczba pierwsza" + " " + liczba;
        }
        return "nie jest liczba pierwsza" + " " + liczba;
    }
}

public class ProgramBigLiczba {

    public static void main(String[] args)
    {
        BigLiczba obj1;
        obj1 = new BigLiczba(7);
        // System.out.println(obj1);

        BigLiczba obj2;
        obj2 = new BigLiczba(6);

        System.out.println(obj1.podzielna(6));
        System.out.println(obj1.pierwsza());
        System.out.println(obj2.podzielna(6));
        System.out.println(obj2.pierwsza());


        



        

        
    }
}