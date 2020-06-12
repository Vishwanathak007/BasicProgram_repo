package array_program_collection;

public class Find_Duplicate_Number_in_an_Array 
{
	public static void main(String[] args) 
	{
		boolean status = false; 
		int[] array = {10,20,30,40,40,50,60,10,20,10};
		System.out.println("Duplicate values in the list are:");
		for(int i=0; i<array.length-1; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					System.out.println(array[i]);
					status = true;
					break;
				}
			}		
		}
		if(status == false)
		{
			System.out.println("No Duplicates Found");
		}
	}
}
