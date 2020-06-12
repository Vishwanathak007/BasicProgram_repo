package inheritance;

public class A extends B
{
	int x = 10;;
	public static void main(String[] args) 
	{
		//B obj =  new B();
		A obj1 = new A();
		B obj3 = new A();
		
		B obj4 = new A(); 
		obj4.add();
		
		float f = 15.54665456f;
		int x = (int) f;
		System.out.println(x);
		
		//System.out.println(obj.x);	//20
		System.out.println(obj1.x);//10
		System.out.println(obj3.x);//20
		
	}
}
