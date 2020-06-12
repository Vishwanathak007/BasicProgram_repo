package encapsulation;

public class B
{
	public static void main(String[] args)
	{
		A obj= new A();
		obj.setEmp_ID(1);
		obj.setName("Ujjwal");
		obj.setAge(35);
		System.out.println("Employee ID is: " +obj.getEmp_ID());
		System.out.println("Employee Name is: " +obj.getName());
		System.out.println("Employee Age is: " +obj.getAge());
	}
}
