import java.util.*;

public class AddTwoMat{
    public static void addition(int mat1[][],int mat2[][],int add[][],int m,int n)
    {
        for(int i = 0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }
    static void printMatrix(int a[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
             System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int m =sc.nextInt();
        System.out.println("enter the number of columns: ");
        int n =sc.nextInt();
        int mat1[][] = new int[m][n];
        int mat2[][] = new int[m][n];
        System.out.println("enter the first matrix elements: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("first matrix is: ");
        printMatrix(mat1,m,n);
        System.out.println("enter the second matrix elements: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat2[i][j]= sc.nextInt();
            }
        }
        System.out.println("second matrix is: ");
        printMatrix(mat2,m,n);
        
        int add[][] = new int[m][n];
        System.out.println("after addition: ");
        addition(mat1,mat2,add,m,n);
        printMatrix(add,m,n);
        
        
    }
}
