package array_program_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while(scan.hasNextInt())
		{
			AL.add(scan.nextInt());
		}
		System.out.println("Values in the list before removing is");
		System.out.println(AL);
		for(int i=0; i<AL.size(); i++)
		{
			System.out.println(AL.get(i));
		}
		System.out.println("Enter the index position you want to remove");
		Scanner scan1 = new Scanner(System.in);
		int pos = scan1.nextInt();
		if(pos > AL.size()-1)
		{	
			System.out.println("Can't remove the value from position as the value doesn't exist in position " + pos);
		}
		else
		{
			AL.remove(pos);
			System.out.println("Values in the list after removing:");
			System.out.println(AL);
			for(int i=0; i<AL.size(); i++)
			{
				System.out.println(AL.get(i));
			}
		}		
		scan.close();
		scan1.close();
	}		
}
