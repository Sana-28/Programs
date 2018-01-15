import java.util.*;
public class Power
{
     public static void main(String[] args)
     {
    	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter power value N:");
 	int n=sc.nextInt();
 
        int i = 0;
        int power = 1;
 
         System.out.println("Powers of 2 that are less than 2^"+n);
         while (i <= n)
         {
             System.out.println("2^"+i+" = " + power);
             power = power * 2;
             i++;
          }
      }
}

