package inheritance;

public class Grand_child_class extends Parent_Class
{
	int z = 30;
	
	public static void Grand_Child_Class_Method()
	{
		System.out.println("Grand Child Class Method");
	}
	
	public static void main(String[] args) 
	{
		//Creating Parent class object, only Parent class method and variables will get access
		Parent_Class obj1 = new Parent_Class();
		obj1.Parent_Class_Method();
		System.out.println("Parent Class Variable access using Parent class object reference: " +obj1.x);
		
		//Creating Child class object, both Parent & child class methods and variables will get access
		Child_class obj2 = new Child_class();
		System.out.println("Parent Class Variable access using Child class object reference: " +obj2.x); 	// Parent class variables
		obj2.Parent_Class_Method();							// Parent class Methods
		Child_class.Child_Class_Method();					// Child class Methods
		System.out.println("Child Class Variable access using Child class object reference: " +obj2.y);		// Child class variables
		
		//Creating an object of child class referring to Parent Class
		Parent_Class obj3 = new Child_class();
		System.out.println(obj3.x); //Will get access only to Parent Class methods & Variables
		obj3.Parent_Class_Method();
		
		//Creating Grand Child class object, Only Parent & inherited Grand child class methods and variables will get access
		Grand_child_class obj4 = new Grand_child_class();
		System.out.println(obj4.x);
		obj4.Parent_Class_Method();
		
		System.out.println(obj4.z);
		Grand_Child_Class_Method();
	}
}
