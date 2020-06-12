package array_program_collection;

import java.util.Scanner;

public class Find_Maximum_and_Minimum_values_in_an_Array 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int i = 0;
		while(scan.hasNextInt())
		{
			a[i] = scan.nextInt();
			i++;
			if(i == 5)
			break;	
		}
		
		int MIN = a[0];
		for(int j=1; j<a.length; j++)
		{
			if(a[j] < MIN)
			{
				MIN = a[j];
			}
		}
		System.out.println("Minimum Value in this list is : "+MIN);
		scan.close();
	}
}
