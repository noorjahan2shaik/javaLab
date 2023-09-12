import java.util.*;
public class calculator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a and b values" );
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("enter the operation to do" );
        char  op = sc.next().charAt(0);;
        double res =0;
        switch(op)
        {
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                res = a/b;
                break;
            case '%':
                res = a%b;
                break;
            case '^':
                res = Math.pow(a,b);
                break;
        }
        System.out.println("result is: " + res);
    }
}
