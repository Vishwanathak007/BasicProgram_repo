package array_program_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Wrapper_Class 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> AL = new ArrayList<Integer>();
		Integer inte = new Integer(20);
		AL.add(inte);
		int z = 30;
		System.out.println(z);
		
		ArrayList<Float> AL1 = new ArrayList<Float>();
		Float f = new Float(10.45646f);
		AL1.add(f);
		
		ArrayList<Character> AL2 = new ArrayList<Character>();
		Character c = new Character('r');
		AL2.add(c);
		
		ArrayList<Double> AL3 = new ArrayList<Double>();
		AL3.add(new Double(12.65789789));
		
		ArrayList<Long> AL4 = new ArrayList<Long>();
		AL4.add(new Long(12678646));
		
		ArrayList li = new ArrayList();
		li.add(10);
		li.add("Ujjwal");
		li.add(null);
		li.add(null);
		li.add("Ujjwal");
		
		Iterator itr = li.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println(li.get(0));
		int x = 20;
		System.out.println(x + (Integer)li.get(0));
		
	}
}
