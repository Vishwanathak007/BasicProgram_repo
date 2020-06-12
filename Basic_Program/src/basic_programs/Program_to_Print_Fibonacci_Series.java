package basic_programs;

import java.util.Scanner;

public class Program_to_Print_Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the count you want to print");
		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();
		int a = 0, b = 1, c;
		if(counter < 1)
		{
			System.out.println("Invalid input!!!!");
		}
		else if(counter == 1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.print(a + "," + b);
			for(int i=2; i<=counter; i++)
			{
				c = a + b;
				System.out.print("," + c);
				a = b;
				b = c;
			}
		}
		scan.close();
	}
}
