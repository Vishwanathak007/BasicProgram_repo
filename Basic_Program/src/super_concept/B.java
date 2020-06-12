package super_concept;

public class B extends A
{
	B()
	{
		//If we don;t put super keyword here, compiler will automatically add.
		//super() is used in case of constructor while super without 
		//braces is used to access methods and variables of parent class
		super(10);		
		System.out.println("Child class Contructor Class B");
	}
	public static void main(String[] args) 
	{
		
	}
}
