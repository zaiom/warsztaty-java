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
}

public class warsztaty42 
{
    public static void main(String[] args) {
        Point obj = new Point(3, 2);
        System.out.println(obj);
        Prostokat a;
        a = new Prostokat((int) obj.getX(), (int) obj.getY(), 3, 5);
        a.info();

    }
}