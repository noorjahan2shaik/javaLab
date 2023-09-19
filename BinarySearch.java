import java.util.*;
public class BinarySearch{
    public static boolean binSearch(int a[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(a[mid] == target)
            {
                return true;
            }
            if(a[mid] < target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
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
        if(binSearch(a,0,n-1,t))
        {
            System.out.println("given target found");
        }
        else
        {
            System.out.println("given target not found");
        }
        
    }
}
