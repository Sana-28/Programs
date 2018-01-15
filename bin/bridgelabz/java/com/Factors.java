import java.util.*;

public class Factors
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to find factors: ");
		Scanner sc=new Scanner (System.in);
		int N=sc.nextInt();
		
		while(N%2==0)
		{
			System.out.println(2+ "");
			N/=2;
		}
		
		for(int i=3;i<=Math.sqrt(N);i+=2)
		{
			while(N%i==0)
			{
				System.out.println(i+ "");
				N/=i;
			}
		}
		
		if(N>2)
		{
			System.out.println(N);
		}

	}
}
