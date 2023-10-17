public class Circle{
    
    public static void main(String args[])
    {
        circle cr1 = new circle();
        cr1.setRadius(5);
        System.out.println("first circle radius " + cr1.getArea());
        System.out.println("first circle perimeter " + cr1.getPerimeter());
        circle cr2 = new circle();
        cr2.setRadius(10);
         System.out.println("second circle radius " + cr2.getArea());
         System.out.println("first circle perimeter " + cr1.getPerimeter());
        circle cr3 = new circle();  
        cr3.setRadius(15);
        System.out.println("third circle radius " + cr3.getArea());
        System.out.println("first circle perimeter " + cr1.getPerimeter());
    }
}
class circle{
    public static double r;
    
    public void setRadius(double radius)
    {
        this.r = radius;
    }
    public static  double pi = 3.14;
    //public static double area;
    double getArea()
    {
        return pi*r*r;
    }
    double getPerimeter()
    {
        return 2*pi*r;
    }
}
