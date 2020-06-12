package basic_programs;

import java.util.Scanner;

public class Leap_Year 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if((year % 400 == 0)||((year % 4 ==0) && (year % 100 != 0)))
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is not a Leap Year");
		}
		scan.close();
	}
}
