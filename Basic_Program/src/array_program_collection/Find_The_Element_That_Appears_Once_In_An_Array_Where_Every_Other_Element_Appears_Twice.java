package array_program_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Find_The_Element_That_Appears_Once_In_An_Array_Where_Every_Other_Element_Appears_Twice 
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
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		for(int i : AL)
		{
			Integer count = HM.get(i);
			boolean status = HM.containsKey(i);
			if(status == false)
			{
				HM.put(i, 1);
			}
			else
			{
				count++;
				HM.put(i, count);
			}
		}
		System.out.println("Element that apeear once in the list is");
		Set<Map.Entry<Integer, Integer>> ES = HM.entrySet();
		for(Map.Entry<Integer, Integer> i : ES)
		{
			if(i.getValue() == 1)
			{
				System.out.println(i.getKey());
			}			
		}
		scan.close();
	}
}
