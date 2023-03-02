class Wektor {
    double x;
    double y;
    double z;

    Wektor(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
        return "[x: " + x + ", y: " + y + ", z: " + z + "]";
    }

    public Wektor plus(Wektor w)
    {
        double new_x = (w.x + x);
        double new_y = (w.x + y);
        double new_z = (w.z + z);

        return new Wektor(new_x,new_y,new_z);
    }

    public Wektor minus(Wektor w)
    {
        double new_x = (w.x - x);
        double new_y = (w.x - y);
        double new_z = (w.z - z);

        return new Wektor(new_x,new_y,new_z);
    }
    
    public Wektor iloczynSkalarny(Wektor w)
    {
        double new_x = (w.x * x);
        double new_y = (w.x * y);
        double new_z = (w.z * z);

        return new Wektor(new_x,new_y,new_z);
    }
}

public class ProgramWektor {

    public static void main(String[] args)
    {
        Wektor obj1;
        obj1 = new Wektor(8,4,3);
        System.out.println("wektor " + obj1);
        
        Wektor obj2;
        obj2 = new Wektor(5,2,1);
        System.out.println("wektor2 " + obj2);

        Wektor obj3 = obj1.iloczynSkalarny(obj2);
        System.out.println("wektor3 " + obj3);

        Wektor obj4 = obj2.minus(obj3);
        System.out.println("wektor4 " + obj4);

        Wektor obj5 = obj3.plus(obj4);
        System.out.println("wektor5 " + obj5);

        



        

        
    }
}