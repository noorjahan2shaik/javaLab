import java.util.*;
public class AreaCircle
{
    public static void main(String args[])
    {
        shape c = new shape();
        shape s = new shape();
        shape r = new shape();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the circle radius");
        double rad = sc.nextInt();
        c.setvalue(rad);       
        
        System.out.print("enter the side of a sqaure");
        float a = sc.nextInt();
        s.setvalue(a);        
        
         System.out.print("enter the length and width");
        float len = sc.nextInt();
        float wid = sc.nextInt();
        r.setvalue(len,wid);
        
        c.getAreaCircle();
        c.getPerimeterCircle();
        s.getAreaSquare();
        s.getPerimeterSquare();
        r.getAreaRect();
        r.getPerimeterRect();
    }
}
class shape{
    double radius;
    double side;
    final double pi = 3.14;
    double length;
    double width;
    void setvalue(double rad)
    {
        this.radius = rad;
    }
    
    void getAreaCircle()
    {
    	double area = pi * radius * radius;
    	System.out.println(area + " is area of circle");
    }
    void getPerimeterCircle()
    {
    	double per = 2 * pi * radius;
    	System.out.println(per + " is perimeter of circle");
    }
    
    void setvalue(float a)
    {
        this.side = a;
    }
    void getAreaSquare()
    {
        double area = side * side;
        System.out.println(area + " is area of square");
    }
    
    void getPerimeterSquare()
    {
        double per = 4 * side;
        System.out.println(per + " is perimeter of circle");
    }
    
    void setvalue(float a,float b)
    {
        this.length = a;
        this.width = b;
    }
    void getAreaRect()
    {
        double area = length * width;
        System.out.println(area + " is area of square");
    }
    void getPerimeterRect()
    {
        double per = (length + width) * 2;
        System.out.println(per + " is perimeter of rectangle");
    }
    
    
}
