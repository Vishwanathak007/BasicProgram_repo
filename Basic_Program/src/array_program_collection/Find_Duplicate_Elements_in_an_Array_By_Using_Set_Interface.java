package array_program_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Find_Duplicate_Elements_in_an_Array_By_Using_Set_Interface
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number in the list");
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("Duplicate values in the list is: ");
		Set<Integer> obj = new HashSet<Integer>();
		for(int num : a)
		{
			boolean status = obj.add(num);
			if(status== false)
			{
				System.out.println(num);
			}
		}
		scan.close();
	}
}
