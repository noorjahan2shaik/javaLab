import java .util.*;
public class Week53{
	static int a;
	static int b;
	public Week53()
	{
		System.out.println("object is created");
	}
	public Week53(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public static void swapByValue(int n1,int n2)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String args[])
	{
		int n1 = 10,n2 = 20;
		Week53 obj = new Week53();
		System.out.println("before swapping " + n1 + "," + n2);
		obj.swapByValue(n1,n2);
		System.out.println("after swapping by value" + n1 + "," + n2);
		Check c = new Check();
		Week53 obj1 = new Week53(n1,n2);
		c.swapByObj(obj1);
		System.out.println("after swapping by object " + obj1.a + "," + obj.b);
	}

}
class Check{
	void swapByObj(Week53 obj)
	{
		int temp;
		temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
	}
}
