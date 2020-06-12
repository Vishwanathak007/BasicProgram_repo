package array_program_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Program_to_remove_duplicate_element_using_HashSet 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the element in the list");
		Scanner scan = new Scanner(System.in);
		
		//First Storing values in the ArrayList 
		ArrayList<String> AL = new ArrayList<String>();
	
		while(!(scan.hasNextInt()))
		{
			AL.add(scan.next());
		}
		
		System.out.println("Values in the list is : "+AL);
		
		HashSet<String> HS = new HashSet<String>();
		
		System.out.println("After Removing Duplicate values, updated list is: ");
		for(String i : AL)
		{
			HS.add(i);	
		}
		System.out.println(HS);
		scan.close();
	}
}
