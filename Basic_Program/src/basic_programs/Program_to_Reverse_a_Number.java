package basic_programs;

import java.util.Scanner;

public class Program_to_Reverse_a_Number 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int tmp = number;
		int remainder, dividend =0;
		while(tmp!=0)
		{
			remainder = tmp % 10;
			dividend = dividend * 10 + remainder;
			tmp = tmp / 10;
		}
		if(number == dividend)
		{
			System.out.println(number + " is Pallindrome");
		}
		else
		{
			System.out.println(number + " is not a Pallindrome");
		}
		scan.close();
	}
}
