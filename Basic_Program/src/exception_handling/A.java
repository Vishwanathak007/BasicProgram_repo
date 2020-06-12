package exception_handling;

public class A 
{
	public static void main(String[] args) 
	{
		int[] a = new int[3];
		try
		{
			int i = a[4];
		}
		catch(ArrayIndexOutOfBoundsException AIE)
		{
			System.out.println("Array Index is Out Of Bounds");
		}	
	}	
}
