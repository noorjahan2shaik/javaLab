import java.util.*;

public class MulTwoMat{
    public static void multiplication(int mat1[][],int mat2[][],int mul[][],int m1,int n1,int m2,int n2)
    {
        if(m2 == n1)
        {
            for(int i = 0;i<m1;i++)
            {
                for(int j =0;j<n2;j++)
                {
                    for(int k =0;k<n1;k++)
                    {
                        mul[i][j] = mul[i][j] + mat1[i][k] * mat2[k][j];
                    }
                }
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
        System.out.println("enter the number of rows for first matrix: ");
        int m1 =sc.nextInt();
        System.out.println("enter the number of columns for first matrix: ");
        int n1 =sc.nextInt();
        int mat1[][] = new int[m1][n1];
        System.out.println("enter the first matrix elements: ");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("first matrix is: ");
        printMatrix(mat1,m1,n1);
        System.out.println("enter the number of rows for second matrix: ");
        int m2 =sc.nextInt();
        System.out.println("enter the number of columns for second matrix: ");
        int n2 =sc.nextInt();
        int mat2[][] = new int[m2][n2];
        System.out.println("enter the second matrix elements: ");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                mat2[i][j]= sc.nextInt();
            }
        }
        System.out.println("second matrix is: ");
        printMatrix(mat2,m2,n2);
        
        int mul[][] = new int[m1][n2];
        System.out.println("after multiplication: ");
        multiplication(mat1,mat2,mul,m1,n1,m2,n2);
        printMatrix(mul,m1,n2);
        
        
    }
}
