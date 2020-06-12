package array_program_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Word_Occurence 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> AL = new ArrayList<String>();
		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		
		while(!(scan.hasNextInt()))
		{
			AL.add(scan.next());
		}
		
		for(String str : AL)
		{	
			if(HM.containsKey(str))
			{
				int count = HM.get(str);
				count++;
				HM.put(str, count);
			}
			else
			{
				HM.put(str, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> ES = HM.entrySet();
		for (Entry<String, Integer> entry : ES) 
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		scan.close();
	}
}
