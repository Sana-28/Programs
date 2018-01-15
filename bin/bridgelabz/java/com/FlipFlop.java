import java.util.*;

public class FlipFlop
{
	public static void main(String args[])
	{
	double flip;
    	double head_count=0;
	double tail_count=0;
	double head_per=0;
	double tail_per=0;
	
	System.out.println("Enter number of times you want to flip coin");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	for(flip=1;flip<=input;flip++)
	{	
		if(Math.random()<0.5)
		{
			head_count++;
		}
		else
		{
			tail_count++;
		}
}
	System.out.println("head_count" +head_count);
	System.out.println("tail_count" +tail_count);

	System.out.println("per of heads "+(head_count/flip)*100+" %");
	System.out.println("per of tails "+(tail_count/flip)*100+" %");
	
	
	}
}
