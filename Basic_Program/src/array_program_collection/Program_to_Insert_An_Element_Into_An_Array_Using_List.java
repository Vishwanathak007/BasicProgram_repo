package array_program_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_to_Insert_An_Element_Into_An_Array_Using_List 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the element in the list");
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while(scan.hasNextInt())
		{
			AL.add(scan.nextInt());
		}
		System.out.println("Original element in the list is:");
		for(int i : AL)
		{
			System.out.println(i);
		}
		System.out.println("Enter the new elements to be added in the list");
		Scanner scan1 = new Scanner(System.in);
		while(scan1.hasNextInt())
		{
			AL.add(scan1.nextInt());
		}
		System.out.println("Updated values in the lists are: ");
		for(int i : AL)
		{
			System.out.println(i);
		}
		scan.close();
		scan1.close();
	}
}
