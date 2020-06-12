package array_program_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_Word_Occurence_in_an_Array_Using_Map 
{
	public static void main(String[] args) 
	{
		String str = "My Name is Ujjwal Name is Ujjwal Kumar Ashutosh Kumar";
		String arr[] = str.split(" ");
		
		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		
		for(String string : arr)
		{
			if(HM.containsKey(string))
			{
				Integer count = HM.get(string);
				count++;
				HM.put(string, count);
			}
			else
			{
				HM.put(string, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> ES = HM.entrySet();
		
		int counter = 0;
		Integer count = 0;
		
		for(Map.Entry<String, Integer> ES_new : ES)
		{
			count = ES_new.getValue();
			counter = count + counter;
		}
		System.out.println("Total number of words in String is: "+counter);
	}
}
