import java.util.*;
public class Products{
    public static void main(String args[])
    {
        Products_class p1 = new Products_class(1,"n1",2,99.90);
        Products_class p2 = new Products_class(2,"n2",21,20.20);
        Products_class p3= new Products_class(3,"n3",12,6.87);
       Products_class p4= new Products_class(4,"n4",5,45.50);
     Products_class p5 = new Products_class(5,"n5",10,40.49);
     
    double total_r_price =0.0;
    Scanner sc = new Scanner(System.in);   
    System.out.print("noor");
    while(true)
    {
        double r_price =0.0;
        System.out.println("enter product id" );
        int pro_id = sc.nextInt();
        if(pro_id ==0)
        {
            break;
        }
        System.out.println("enter quantity sold");
        int q_sold = sc.nextInt();
        
        switch(pro_id)
        {
            case 1:
                r_price = p1.p_price;
                break;
            case 2:
                r_price = p2.p_price;
                break;
            case 3:
                r_price = p3.p_price;
                break;
            case 4:
                r_price = p4.p_price;
                break;
            case 5:
                r_price = p5.p_price;
                break;
            default:
                System.out.println("invalid id");
                continue;
            }    
            total_r_price = total_r_price + (r_price*q_sold);
    }
    System.out.println("total retail price" + total_r_price);
    }
        
    
}
class Products_class
{
    int p_id;String p_name;int p_qua;double p_price;
    
    Products_class(int a,String b,int c,double d)
    {
       this.p_id = a;
       this.p_name = b;
       this.p_qua = c;
       this.p_price =d;
    }
}
