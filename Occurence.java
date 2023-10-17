import java.util.*;
public class Occurence{
    public static void changeCase(String str)
    {
        System.out.println("change string into uppercase: " + str.toUpperCase());
        System.out.println("change string into lowercase: " + str.toLowerCase());
        StringBuffer s = new StringBuffer(str);
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                s.setCharAt(i,Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch))
            {
                s.setCharAt(i,Character.toLowerCase(ch));
            }
        }
        System.out.println("chnged uppercase letter to lower case to upper case: " + s);
    }
    public static void main(String args[])
    {
        System.out.println("enter the strings: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("enter the index : ");
        char ch= str1.charAt(sc.nextInt());

       int count =0;
        
            for(int i=0;i<str1.length();i++)
            {
                int x = str1.indexOf(ch);
                if(str1.charAt(x) == str1.charAt(i))
                count++;  
            }      
            System.out.println("no.of "+ ch + " are " + count);
            System.out.println("change upper case and lower case");
            changeCase(str1);
    }
}
