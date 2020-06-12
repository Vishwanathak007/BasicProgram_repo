package array_program_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Character_Occurence_In_String 
{
	public static void main(String[] args) 
	{
		String str = "Ujjwal Kumar Working as Tester. Ujjwal Kumar is good in manual and automation";
		//Split the string on the basis of space and store it in an Array arr
		String[] arr = str.split(" ");
		
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		
		for(String str1 : arr)
		{
			//convert the splitted string array into character array
			char[] ch = str1.toCharArray();
			for(char character : ch)
			{
				Integer count = HM.get(character);
				if(HM.containsKey(character))
				{
					count++;
					HM.put(character, count);
				}
				else
				{
					HM.put(character, 1);
				}
			}
		}
		
		Set<Map.Entry<Character, Integer>>  ES = HM.entrySet();
		for(Entry<Character, Integer> entry : ES) 
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
