package basic_programs;

import java.util.Scanner;

public class Program_to_Reverse_a_String 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String tmp = str;
		String temp = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			temp = temp + tmp.charAt(i);
		}
		if(temp.equalsIgnoreCase(str))
		{
			System.out.println(str + " is Pallindrome");
		}
		else
		{
			System.out.println(str + " is not a Pallindrome");
		}
		scan.close();
	}
}
