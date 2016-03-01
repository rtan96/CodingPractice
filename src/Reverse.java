// write a code to reverse a string 
import java.util.*;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Reverse
{
	public static void main(String[] args)
	{
	System.out.println("Enter the string to be reversed");
	Scanner s= new Scanner(System.in);
	StringBuilder builder= new StringBuilder();
	String line=s.nextLine();
	System.out.println("The input string is "+line);
	for(int i=line.length()-1;i>=0;i--)
	{
		builder.append(line.charAt(i));
	}
	System.out.println("The reversed string is " + builder.toString());

	StringBuilder sb = new StringBuilder(line);
	System.out.println("Reversed string using another method is = " +
		sb.reverse().toString());

	}
}