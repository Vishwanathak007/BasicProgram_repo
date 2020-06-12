package basic_programs;

import java.util.Scanner;

public class Program_to_Check_Whether_A_Number_is_Prime_or_Not 
{
	public static void main(String[] args)
	{
		boolean status = false;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number < 0)
		{
			System.out.println("Invalid input!!!!!!!!!");
		}
		else if((number == 0)||(number == 1))
		{
			System.out.println(number + " is not Prime");
		}
		else
		{
			for(int i=2; i<=number/2; i++)
			{
				if(number % i == 0)
				{
					status = true;
					break;
				}
				else
				{
					status = false;
				}
			}
			if(status == false) 
			{
				System.out.println(number + " is Prime");
			}
			else
			{
				System.out.println(number + " is not Prime");
			}
		}
		scan.close();
	}
}
