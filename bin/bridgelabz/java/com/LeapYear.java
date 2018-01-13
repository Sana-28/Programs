import java.util.*;

public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		
		if(((year%400==0) || ((year%100==0) && (year%4==0))))
		{
			System.out.println("Year "+year+" is a Leap Year");
		}
		else
		{
			System.out.println("Year "+year+" is not a Leap Year");
		}
		
	}
}

