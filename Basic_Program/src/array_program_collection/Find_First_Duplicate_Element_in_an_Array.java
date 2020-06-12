package array_program_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Find_First_Duplicate_Element_in_an_Array 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number in the list");
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while(scan.hasNextInt())
		{
			AL.add(scan.nextInt());
		}
		HashSet<Integer> HS = new HashSet<Integer>();
		System.out.println("First Duplicare Element in the list is:");
		boolean status = false;
		for(int i : AL)
		{
			if(!(HS.add(i)))
			{
				System.out.println(i);
				break;
			}
			else
			{
				status = false;
			}
		}
		if(status == false)
		{
			System.out.println("No duplicates found");
		}
		scan.close();
	}
}
