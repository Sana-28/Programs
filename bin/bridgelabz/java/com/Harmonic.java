import java.util.*;

public class Harmonic
{
	public static void main(String args[])
	{
		float i;
		float term;
	    	float sum=0;
		
		System.out.println("Enter value of N");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		for(i=1;i<=N;i++)
		{
			 term = 1/i;
			sum=sum+term;
		}
		System.out.println("Sum of Harmonic series is=%f" +sum);
		}
		
}

