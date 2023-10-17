import java.util.*;
public class Unique{
    public static void main(String args[])
    {
        Random rand = new Random(0,10);
        int arr[]= new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = rand.nextInt();
            System.out.println(arr[i]);
            for(int j=0;j<=i;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.print("it is duplicate num enter again");
                    i--;
                    break;
                }
            }
  
        }
    }
}
