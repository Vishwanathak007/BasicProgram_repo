package array_program_collection;

import java.util.Scanner;

public class Find_Second_Largest_Number_in_an_Array 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int temp;
		for(int i=0; i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.print("Second Largest Number from the list is: ");
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
		scan.close();		
	}
}
