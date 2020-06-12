package array_program_collection;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		HashSet<String> HS = new HashSet<String>();
		
		while(!(scan.hasNextInt()))
		{
			HS.add(scan.next());
		}
		
		System.out.println("After adding, values in the list is:");
		
		System.out.println(HS);
		
		for(String str : HS)
		{
			System.out.println(str);
		}
		
		System.out.println("Enter the String value you want to remove");
		Scanner scan1 = new Scanner(System.in);
		String str = scan1.next();
		boolean status = true;
		
		System.out.println("After removing values in the lists are");
		
		for(String str1 : HS)
		{
			if((str1.equalsIgnoreCase(str)))
			{
				status = true;
				HS.remove(str1);
				System.out.println(HS);
				for(String str2 : HS)
				{
					System.out.println(str2);
				}
			}
			else
			{
				status = false;
			}
		}
		if(status == false)
		{
			System.out.println("You can't remove value as the value doesn't exists in this position");
		}
		scan.close();
		scan1.close();
	}
}
