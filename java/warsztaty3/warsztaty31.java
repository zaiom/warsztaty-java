import java.awt.Rectangle;

public class warsztaty31 
{
    public static void main(String[] args)
    {
        Rectangle obj1=new Rectangle(0,0,4,3); 
   
        obj1.translate(1,-1);                  

        System.out.println(obj1); 


        Rectangle obj2 = new Rectangle(1,1,4,3);
        Rectangle k1 = obj1.intersection(obj2);
        System.out.println(obj2);
        System.out.println(k1);


        Rectangle obj3 = new Rectangle(1,1,4,5);
        Rectangle obj4 = new Rectangle(2,0,2,3);
        boolean k2 = obj3.contains(obj4);
        System.out.println(k2);

        Rectangle obj5 = new Rectangle(-3,0,6,3);
        boolean k3 = obj5.contains(2,-1);
        System.out.println(k3);

        Rectangle obj6 = new Rectangle(1,1,4,5);
        Rectangle obj7 = new Rectangle(4,-3,4,3);
        boolean k4 = obj6.intersects(obj7);
        System.out.println(k4);
    }  
    
}
