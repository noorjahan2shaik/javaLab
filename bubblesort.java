import java.util.*;

public class bubblesort{
    public static void bubblesort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
                
            }
        }
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
        bubblesort(a,n);
        System.out.println("after sorting elements are: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i] + " ");
        }

    }
}
