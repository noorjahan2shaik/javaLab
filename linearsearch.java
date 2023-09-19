import java.util.*;
public class linearsearch{
    public static boolean lSearch(int a[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            if(target == a[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n =sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int t = sc.nextInt();
        if(lSearch(a,n,t))
        {
            System.out.println("given target found");
        }
        else
        {
            System.out.println("given target not found");
        }
        
    }
}
