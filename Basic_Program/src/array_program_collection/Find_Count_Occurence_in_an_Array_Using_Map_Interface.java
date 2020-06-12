package array_program_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Find_Count_Occurence_in_an_Array_Using_Map_Interface 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number in the list");
		ArrayList<Integer> AL = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt())
		{
			AL.add(scan.nextInt());
		}
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		for(int i : AL)
		{
			Integer occurence_count = HM.get(i);
			if(occurence_count == null)
			{
				HM.put(i, 1);
			}
			else
			{
				occurence_count++;
				HM.put(i, occurence_count);
			}
		}
		Set<Map.Entry<Integer,Integer>> ES = HM.entrySet();
		System.out.println("Duplicate elements in list are:-");
		boolean status = true;
		for(Map.Entry<Integer,Integer> entry : ES)
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
				status = false;
			}
			else
			{
				status = true;
			}
		}
		if(status == true)
		{
			System.out.println("No duplicates found in the list");
		}
		scan.close();
	}
}
