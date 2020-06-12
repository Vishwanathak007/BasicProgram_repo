package interface_concept;

public class TestA implements Test, Test1
{
	public void add() 
	{
		System.out.println("Add Method");
	}
	public void sub() 
	{
		System.out.println("Sub Method");	
	}
	public void multiplication() 
	{
		System.out.println("Multiplication Method");
	}
	public void division() 
	{
		System.out.println("Division Method");	
	}
	
	public static void main(String[] args)
	{
		TestA obj = new TestA();
		obj.add();
		obj.sub();
		obj.multiplication();
		obj.division();
	}
}
