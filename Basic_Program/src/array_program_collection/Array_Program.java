package array_program_collection;

import java.util.Scanner;

public class Array_Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch[] = str.toCharArray();
		char[] upper_case = new char[5];
		char[] lower_case = new char[5];
		int[] digit = new int[5];
		for(int i=0; i<ch.length; i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				upper_case[i] = ch[i];
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lower_case[i] = ch[i];
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digit[i] = ch[i];
			}
		}
		scan.close();
	}
}
