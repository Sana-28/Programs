import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class username
{
   private static String REGEX = "<<UserName>>";
	   private static String INPUT = "Hello <<UserName>> , How are you?";
	 public static void main(String[] args) 
	   {
	     System.out.println("Enter The String....");
	     Scanner sc=new Scanner(System.in);
	     String input=sc.nextLine(); 
	     //String name=input.replace("<<UserName>>", name); 
	      Pattern p = Pattern.compile(REGEX);
	      Matcher m = p.matcher(INPUT); 
	      INPUT = m.replaceAll(input); 
	      System.out.println(INPUT);
	   }
}

