package array_program_collection;

import java.util.Scanner;

public class Program_to_Insert_An_Element_Into_An_Array_Using_Loop 
{
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50};
		System.out.println("Enter the index position you want to enter");
		
		Scanner scan  = new Scanner(System.in);
		int position = scan.nextInt();
		System.out.println("Enter the value which you want to enter in index position:"+position);
		
		int number = scan.nextInt();
		
		if(position > arr.length - 1)
		{
			System.out.println("Can't insert value");
		}
		else
		{
			for(int i=arr.length - 1; i>=0; i--)
			{
				
			}
		}
		scan.close();
	}
}
