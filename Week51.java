import java.util.*;
public class Week51{
	private static int radius;
	public Week51(int radius)
	{
		this.radius = radius;
	}
	public static void circleArea()
	{
		double area = 3.14 * radius * radius;
		System.out.println("area of the circle is: " + area);
	}
	public static void circlePerimeter()
	{
		double perimeter = 2 * 3.14 * radius;
		System.out.println("perimeter of the circle is: " + perimeter);
	}
	public static void main(String args[])
	{
		System.out.println("enter the radius of the circle");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		Week51 circle = new Week51(radius);
		circle.circleArea();
		circle.circlePerimeter();
	}
}
