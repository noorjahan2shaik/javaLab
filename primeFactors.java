import java.util.*;
public class primeFactors{
    public static void check(int i)
    {   
        int count =0;
        for(int j =2;j<i;j++)
        {
            if(i%j == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value" );
        int n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
            {
                check(i);
            }
        }
        System.out.println("these are the prime factors of" + n);
     }
 }
