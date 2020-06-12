package array_program_collection;

public class Find_First_Duplicate_Element_in_an_Array_using_loop 
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,30,60,30,60};
		System.out.println("First duplicate element in the list is : ");
		boolean status = false;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
					status = true;
					break;
				}
			}
			if(status == true)
			{
				break;
			}
		}
	}
}
