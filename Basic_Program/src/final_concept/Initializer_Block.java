package final_concept;

public class Initializer_Block 
{
	Initializer_Block()
	{
		System.out.println("No Argument constructor");
	}
	
	Initializer_Block(int a)
	{
		System.out.println("Parameterised constructor");
	}
	
	{
		System.out.println("Initializer block started");
	}
	
	{
		System.out.println("Initializer block started Again");
	}
	
	public static void main(String[] args) 
	{
		new Initializer_Block();
		new Initializer_Block(10);
		System.out.println("I am in Main Method");
	}
}
