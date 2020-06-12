package basic_programs;

import java.util.Scanner;

public class Program_to_Find_the_Factorial_of_the_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number < 0)
		{
			System.out.println("Invalid Input!!!!!!!!!");
		}
		else if(number == 0)
		{
			System.out.println("Factorial value of "+number + " is : 1");
		}
		else
		{
			int fact = 1;
			for(int i=number; i>=1; i--)
			{
				fact = fact * i;
			}
			System.out.println("Factorial value of "+number + " is : " + fact);
		}
		scan.close();
	}
}
