class Ulamek
{
    int licznik;
    int mianownik;

    Ulamek(int licznik, int mianownik)
    {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }


    public String toString()
    {
        return licznik+"/"+mianownik;
    }

    double rozwDziesietne()
    {
        double x;
        x = (double)licznik;

        return x/mianownik;
    }

    int NWD(int a, int b)
    {
        while (a!=b)
        {
            if (a>b)
            {
                a-=b;
            }

            else
            {
                b-=a;
            }
        }
        return a;
    }

    Ulamek plus(Ulamek obj)
    {
        int a = NWD(mianownik, obj.mianownik);
        int a2 = NWD(mianownik, obj.mianownik);

        if (a==1)
        {
            a = mianownik;
            a2 = obj.mianownik;
        }

        if (mianownik == obj.mianownik)
        {
            licznik = licznik + obj.licznik;
            

        }
        else
        {
            licznik *= a2;
            mianownik *= a2;
            obj.licznik *= a;
            obj.mianownik *= a;

            licznik += obj.licznik;
        }
        return new Ulamek(licznik,mianownik);


        // if (mianownik == obj.mianownik)
        // {
        //     licznik = licznik + obj.licznik;
        //     return new Ulamek(licznik,mianownik);
        // }
        // else
        // {
        //     licznik = licznik * obj.mianownik;
        //     obj.licznik = obj.licznik * mianownik;
        //     mianownik = mianownik * obj.mianownik;
        //     licznik = licznik + obj.licznik;

        //     return new Ulamek(licznik,mianownik);
        // }
    }

    Ulamek minus(Ulamek obj)
    {
        int a = NWD(mianownik, obj.mianownik);
        int a2 = NWD(mianownik, obj.mianownik);

        if (a==1)
        {
            a = mianownik;
            a2 = obj.mianownik;
        }

        if (mianownik == obj.mianownik)
        {
            licznik = licznik - obj.licznik;
            

        }
        else
        {
            licznik *= a2;
            mianownik *= a2;
            obj.licznik *= a;
            obj.mianownik *= a;

            licznik -= obj.licznik;
        }
        return new Ulamek(licznik,mianownik);
    }

    Ulamek razy(Ulamek obj)
    {
        licznik *= obj.licznik;
        mianownik *= obj.mianownik;
        return new Ulamek(licznik,mianownik);
    }

    void odwroc()
    {
        int a;
        int b;
        a = licznik;
        b = mianownik; 
        licznik = b;
        mianownik = a;
        new Ulamek(licznik,mianownik);
    }

    void skroc()
    {
        int a = NWD(licznik, mianownik);
        licznik = licznik / a;
        mianownik = mianownik / a;
        new Ulamek(licznik,mianownik);
        

    }


}


public class Warsztaty2 
{
    public static void main(String[] args)
    {
        Ulamek obj,obj2;
        obj=new Ulamek(6,8);
        obj2=new Ulamek(3,7);
        System.out.println(obj);
        System.out.println(obj2);

        // double k1=obj.rozwDziesietne();
        // System.out.println(k1);


        // Ulamek obj3 = obj.plus(obj2);
        // System.out.println(obj3);

        // Ulamek obj4 = obj.minus(obj2);
        // System.out.println(obj4);

        Ulamek obj5 = obj.razy(obj2);
        System.out.println(obj5);

        // obj.odwroc();
        // System.out.println(obj);

        obj.skroc();
        System.out.println(obj);

        // System.out.println(obj.NWD(12,18));




    }
}
