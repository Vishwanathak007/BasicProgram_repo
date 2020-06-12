package basic_programs;

import java.util.Scanner;

public class Ladder_Program 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(i % 2 !=0)
			{
				System.out.println("_");
			}
			else
			{
				for(int j=1; j<=i-1; j++)
				{
					System.out.print(" ");
				}
				System.out.print("|");
			}
		}
		scan.close();
		
		System.out.println("\"Ujjwal\"");
	}
}
