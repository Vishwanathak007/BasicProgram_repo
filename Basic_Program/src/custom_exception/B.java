package custom_exception;

import java.util.Scanner;

public class B 
{
	public static void main(String[] args)
	{
		System.out.println("Enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.println("Before Try Catch Finally  Block");
		try
		{
			if(age < 18)
			{
				User_Defined_Exceptions obj = new User_Defined_Exceptions("Not eligible for voting");
				throw obj;
			}
			else
			{
				System.out.println("You are eligible for voting");
			}
		}
		catch(User_Defined_Exceptions UDE)
		{
			System.out.println("Not Eligible for voting");
			UDE.printStackTrace();
		}
		finally
		{
			scan.close();
		}
		System.out.println("After Try Catch Finally  Block");
	}
}
