package polymorphism;

public class B extends A
{
	int x = 20;
	public void test2()
	{
		System.out.println(x);
		System.out.println("Test Method in child Class B");
	}
	
	public static void main(String[] args)
	{
		B obj = new B();
		obj.test2();
		System.out.println("*************");
		A obj1 = new A();
		obj1.test2();
		System.out.println("*************");
		A obj2 = new B();
		obj2.test2();
	}
}
