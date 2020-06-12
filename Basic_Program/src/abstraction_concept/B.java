package abstraction_concept;

public class B extends A
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.add();
		obj.x = 20;
		System.out.println(obj.x);
		C obj1 = new C();
		obj1.add();
	}
	
	@Override
	public void add() 
	{
		System.out.println("Add Method in Class B");		
	}
}
