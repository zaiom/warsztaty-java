import java.awt.Rectangle;
import java.awt.Point;

class Prostokat extends Rectangle 
{

    Prostokat(int x, int y, int wys, int szer) {
        super(x, y, wys, szer);
    }

    void info() {
        System.out.println(this);
    }

    void przylega(Prostokat Prostokat) {
        if (this.intersects(Prostokat)) {
            System.out.println("przylega");
        } else {
            System.out.println("nie przylega");
        }

    }
}

public class warsztaty43
{
    public static void main(String[] args) {
        Prostokat a;
        Prostokat b;
        Prostokat c;
        a = new Prostokat(0, 0, 3, 5);
        b = new Prostokat(5, 5, 1, 2);
        c = new Prostokat(2, 2, 10, 10);
        a.info();
        b.info();
        c.info();

        a.przylega(b);
        c.przylega(a);
    }
}