import java.util.*;
class Object{
	double a_bal;
	private String a_name;
	private String a_no;
	private String a_add;
	
	public Object(String a_name,String a_no,String a_add)
	{
		this.a_bal = 1000;
		this.a_name = a_name;
		this.a_no = a_no;
		this.a_add = a_add;
	}
	public void credit(double deposite)
	{
		a_bal = a_bal + deposite; 
		System.out.println("deposited successfully");
	}
	public void getBalance()
	{
		System.out.println("present balance is: "+ a_bal);
	}
	public  void debit(double money)
	{
		if(money > a_bal)
		{
			System.out.println("no sufficient balance");
		}
		else
		{
			a_bal = a_bal - money;
			System.out.println("debited successfully");
		}
	}
}
public class Week54{
	
	public static void main(String args[])
	{
		Object p1 = new Object("noorjahan","1234","matedu");
		Object p2 = new Object("afri","1452","thorrur");
		Object p3 = new Object("noor","123456","wgl");
		p1.credit(1000);
		p1.getBalance();
		p2.getBalance();
		p2.debit(2000);
		p1.debit(1000);
		p2.credit(5000);
		p3.getBalance();
		
	}
}
