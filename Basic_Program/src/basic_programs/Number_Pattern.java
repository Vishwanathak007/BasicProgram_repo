package basic_programs;

import java.util.Scanner;

public class Number_Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		System.out.println("************Type1************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		System.out.println("************Type2************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println("************Type3************");
		int Counter = 0;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				Counter++;
				System.out.print(Counter + " ");
			}
			System.out.println();
		}
		System.out.println("************Type4************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("************Type5************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			for(int k=i-1; k>=1; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("************Type6************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
