abstract class Figura // nie mozna tworzyc instancji tej klasy
{
    abstract double pole(); // metoda abstrakcyjna

    abstract double obwod();

    void info() 
    {
        System.out.println(this);
    }
}

class Okrag extends Figura 
{
    double promien;

    Okrag(double promien) 
    {
        this.promien = promien;
    }

    double pole() 
    {
        return 3.14 * promien * promien;
    }

    double obwod() 
    {
        return 2 * 3.14 * promien;
    }

    public String toString() 
    {
        return "okrag o pr. " + promien;
    }
}

class Trojkat extends Figura 
{
    double a;
    double h;

    Trojkat(double a, double h) 
    {
        this.a = a;
        this.h = h;
    }

    double pole() 
    {
        return a * h / 2;
    }

    double obwod() 
    {
        return 3 * a;
    }

    public String toString() 
    {
        return "trojkat o wysokosci " + h;
    }
}

class Kwadrat extends Figura 
{
    double a;

    Kwadrat(double a) 
    {
        this.a = a;
    }

    double pole() 
    {
        return a * a;
    }

    double obwod() 
    {
        return 4 * a;
    }

    public String toString() 
    {
        return "kwadrat o boku " + a;
    }
}

class Trapez extends Figura 
{
    double a;
    double b;
    double c;
    double d;

    Trapez(double a, double b, double c, double d) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    double pole() 
    {
        return (a + b) * c / 2;
    }

    double obwod() 
    {
        return a + b + c + d;
    }

    public String toString() 
    {
        return "trapez o podstawie " + a;
    }
}

public class warsztaty44
{
    public static void main(String[] args) 
    {
        Figura z = new Okrag(2);
        Figura k = new Kwadrat(5);
        Figura t = new Trojkat(5, 3);
        Figura x = new Trapez(1, 2, 3, 4);
        z.info();
        k.info();
        t.info();
        x.info();
        System.out.println(k.obwod());
        System.out.println(t.obwod());
        System.out.println(x.obwod());
 

    }
}