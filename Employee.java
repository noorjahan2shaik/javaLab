import java.util.*;
public class Employee{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees: ");
        int n = sc.nextInt();
        int emp_id[] = new int[n];
        String emp_name[] = new String[n];
        int emp_age[] = new int[n];
        String emp_des[] = new String[n];
        int emp_salary[] = new int[n];
        String emp_add[] = new String[n];
        System.out.println("enter id,name,age,designation,salary,address");
        /*for(int i=0;i<n;i++)
        {
            emp_id[i] = sc.nextInt();
             sc.nextLine();
            emp_name[i] = sc.nextLine();
            emp_age[i] = sc.nextInt();
             sc.nextLine();
            emp_des[i] = sc.nextLine();
            emp_salary[i] = sc.nextInt();
             sc.nextLine();
            emp_add[i] = sc.nextLine(); 
        }*/
       System.out.println("enter the ids: ");
        for(int i=0;i<n;i++)
        {
            emp_id[i] = sc.nextInt();
        }
        System.out.println("enter the name: ");
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            emp_name[i] = sc.nextLine();
        }
        System.out.println("enter the age: ");
        for(int i=0;i<n;i++)
        {
            emp_age[i] = sc.nextInt();
        }
        System.out.println("enter the designation: ");
         sc.nextLine();
        for(int i=0;i<n;i++)
        {
            emp_des[i] = sc.nextLine();
        }
        System.out.println("enter the salary: ");
        for(int i=0;i<n;i++)
        {
             emp_salary[i] = sc.nextInt();
        }
        System.out.println("enter the address: ");
         sc.nextLine();
        for(int i=0;i<n;i++)
        {
             emp_add[i] = sc.nextLine(); 
        }
        System.out.println("enter the finding id: ");
        int given_id = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(given_id == emp_id[i])
            {
                System.out.println(emp_id[i] + " " + emp_name[i] + " "+ emp_age[i] + " " +emp_des[i] + " "+ emp_salary[i] + " "+ emp_add[i]);
            }
        }
        
    }
}
