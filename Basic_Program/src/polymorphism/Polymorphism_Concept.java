package polymorphism;

public class Polymorphism_Concept
{
	public void show(int a)
	{
		System.out.println("One Argument Method");
	}
	
	public void show(int... a)
	{
		System.out.println("Varargs Method");
	}
	
	public static void main(String[] args)
	{
		Polymorphism_Concept obj = new Polymorphism_Concept();
		obj.show();
		obj.show(10);
		obj.show(10,50,30,40);
	}
}
