package abstraction_concept;

public class static_vs_final 
{
	static int counter;
	
	public static void main(String[] args) 
	{
		static_vs_final obj = new static_vs_final();
		obj.add();
		static_vs_final obj1 = new static_vs_final();
		obj1.add();
		System.out.println(counter);
	}
	
	public void add()
	{
		counter++;
	}
}
