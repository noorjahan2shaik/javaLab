import java.util.*;
import java.util.Random;
public class largeSmaller{
public static int minimum(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<5;i++)
        {
            if(min> arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static int maximum(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<5;i++)
        {
            if(max< arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
         // create instance of Random class
        Random rand = new Random();
        int arr[] = new int[5];
        // Generate random integers in range 0 to 999
        for(int i=0;i<5;i++)
        {
            arr[i]= rand.nextInt(1000);
        }
        for(int i=0;i<5;i++)
        {
           System.out.print(arr[i] + " ");
        }
        System.out.println("maximum number is: " + maximum(arr));
        System.out.println("maximum number is: " + minimum(arr));
    }
}
