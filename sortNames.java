import java.util.*;

public class SortNames{
    public static void main(String args[])
    {
        Scanner sc = new Scanner9System.in);
        System.out.println("enter the number of strings");
        int n = sc.nextInt();
        String names[] = new String[n];
        for(int i=0;i<n;i++)
        {
            names[i] = sc.nextString();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i] + " ");
        }
    }
}
