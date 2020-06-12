package encapsulation;

public class A 
{
	private int Emp_ID, Age;
	private String Name;
	
	public void setEmp_ID(int Emp_ID)
	{
		this.Emp_ID = Emp_ID;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	
	public int getEmp_ID()
	{
		return Emp_ID;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public int getAge()
	{
		return Age;
	}
}
