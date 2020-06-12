package exception_handling;

public class Exception 
{	
	  //It throws the Exception(ArithmeticException). 
	 // The runTime System searches the appropriate Exception handler
	//  In this method found appropriate Exception handler i.e. matching catch block
	public static int Excep1(int a, int b)
	{
		int res = 0;
		try
		{
			res = a / b;
		}
		catch(NumberFormatException AE)
		{
			AE.printStackTrace();
		}
		return res;
	}
	//Appropriate Exception handler is not found within this method.
	public static int Excep2(int a, int b)
	{
		int res = 0;
		try
		{
			res = Excep1(a, b);
		}
		// doesn't matches with ArithmeticException
		catch(NullPointerException AE)
		{
			// getMessage will print description of exception(here / by zero)
			System.out.println(AE.getMessage());
		}
		return res;
	}
	// In this method found appropriate Exception handler i.e. matching catch block
	public static void main(String[] args) 
	{
		try
		{
			Excep2(50,0);
		}
		// matching ArithmeticException
		catch(ArithmeticException AE)
		{
			System.out.println("Can't divide by zero");
		}
	}
}
