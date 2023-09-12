import java.util.*;
import java.lang.Math;
public class quadratic{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the a values: ");
    int a = sc.nextInt();
    System.out.println("enter the b values: ");
    int b = sc.nextInt();
    System.out.println("enter the c values: ");
    int c = sc.nextInt();
    double d = b*b-4.0*a*c;
    double sqrtval = Math.sqrt(Math.abs(d));
    if(d>0.0)
    {
         double x1 = (-b + Math.pow(d,0.5))/2*a;
         double x2 = (-b - Math.pow(d,0.5))/2*a;
         System.out.println("solutions are: "+ x1 + "and "+ x2);
    }
    else if (d == 0.0)    
    {
        double x1 = -b/2*a;
        System.out.println(x1);
    }
    else if(d <0)
    {
        System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
    }
    else
    {
        System.out.println("no real roots");
    }
    }
    }
