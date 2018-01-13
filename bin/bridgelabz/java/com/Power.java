import java.util.*;

public class task1d
{
     public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
	    System.out.println("Enter power value N:");
	    int power=sc.nextInt();

	    
          
 	    System.out.println("Powers of 2 that is less than 2^");
	    int n=sc.nextInt();

            int i = 0;
           // int power = 1;
 
           
            while (i <= n)
            {
                System.out.println("2^"+i+" = " + power);
                power = 2^ power;
                i++; 
            }
        }
}
