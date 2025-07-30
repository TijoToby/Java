import java.util.*;
class Circle
{
    double radius;
Circle(double r)
{
    radius=r;
}
void computeAndDisplay(){
    double area=Math.PI * radius * radius;
    double circumference=2*Math.PI*radius;
    System.out.println("Radius:"+radius);
    System.out.println("Area:"+area);
    System.out.println("Circumference:"+circumference);
}
}
public class circlefind{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
    
System.out.println("Enter radius of the circle:");
    double r= in.nextDouble();
        Circle c=new Circle(r);
        c.computeAndDisplay();
    }
}
           