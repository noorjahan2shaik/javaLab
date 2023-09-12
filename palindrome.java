import java.util.*;
public class palindrome{
    public static boolean checkPalindrome(int n){
        int x = n;
        int rem=0;
        int rev = 0;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(rev == x)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
    }
}
