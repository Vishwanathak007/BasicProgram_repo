package final_concept;

public class Child_Class extends Parent_Class
{
	static int x;
	static
	{
		System.out.println("Hello.....I am in first static block");
	}
	
	static
	{
		System.out.println("Hello.....I am in second static block");
	}
	
	public static void main(String[] args)
	{
		System.out.println(x);
	}
	
	static
	{
		System.out.println("Hello.....I am in third static block");
		x = 20;
	}
}
