package this_concept;

public class A 
{
	A()
	{
		System.out.println("Default Constructor");
	}
	
	A(A obj)
	{
		this();
		System.out.println("Parameterised Constructor");
	}
	
	public void add()
	{
		new A(this);
	}
	
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.add();
	}
}
