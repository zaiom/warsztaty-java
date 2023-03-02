class LiczbaZespolona
{
    int czescRzeczywista;
    int czescUrojona;

    LiczbaZespolona(int czescRzeczywista, int czescUrojona)
    {
        this.czescRzeczywista = czescRzeczywista;
        this.czescUrojona = czescUrojona;
    }

    LiczbaZespolona dodaj(LiczbaZespolona obj)
    {
        int czRzeczywista, czUrojona;
        czRzeczywista = obj.czescRzeczywista + this.czescRzeczywista;
        czUrojona = obj.czescUrojona + this.czescUrojona;
        return new LiczbaZespolona(czRzeczywista, czUrojona);
    }

    LiczbaZespolona odejmij(LiczbaZespolona obj)
    {
        int czRzeczywista, czUrojona;
        czRzeczywista = this.czescRzeczywista - obj.czescRzeczywista;
        czUrojona = this.czescUrojona - obj.czescUrojona;
        return new LiczbaZespolona(czRzeczywista, czUrojona);
    }

    LiczbaZespolona pomnoz(LiczbaZespolona obj)
    {
        int czRzeczywista, czUrojona;
        czRzeczywista = (obj.czescRzeczywista * this.czescRzeczywista) + (this.czescUrojona * obj.czescUrojona) * (-1);
        czUrojona = (this.czescRzeczywista * obj.czescUrojona) + (this.czescUrojona * obj.czescRzeczywista);
        return new LiczbaZespolona(czRzeczywista, czUrojona);
    }

    public String toString()
    {
        if (czescUrojona > 0)
        {
            return czescRzeczywista+" + "+czescUrojona+"i";
        }
        else
        {
            return czescRzeczywista+" "+czescUrojona+"i";
        }
    }
}

public class liczbyZespolone
{
    public static void main(String[] args)
    {

        LiczbaZespolona z1, z2;
        z1 = new LiczbaZespolona(5,2);
        z2 = new LiczbaZespolona(3,-7);
        System.out.println(z1);
        System.out.println(z2);

        LiczbaZespolona z3 = z1.dodaj(z2);
        System.out.println(z3);

        LiczbaZespolona z4 = z1.odejmij(z2);
        System.out.println(z4);

        LiczbaZespolona z5 = z1.pomnoz(z2);
        System.out.println(z5);


    }
}
