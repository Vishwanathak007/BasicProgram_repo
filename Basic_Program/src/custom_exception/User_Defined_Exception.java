package custom_exception;

public class User_Defined_Exception extends Exception
{
	// default constructor 
	User_Defined_Exception() 
	{ 
	} 

	// parametrized constructor 
	User_Defined_Exception(String str) 
	{ 
		super(str); 
	}
	
	//store account information 
	private static int accno[] = {1001, 1002, 1003, 1004}; 

	private static String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"}; 

	private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55}; 	
	
	// write main()
	public static void main(String[] args) 
	{
		// Java program to demonstrate user defined exception 
		//This program throws an exception whenever balance amount is below Rs. 1000 
 
			try 
			{ 
				// display the heading for the table 
				System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" +"BALANCE"); 

				// display the actual account information 
				for (int i = 0; i < 5 ; i++) 
				{ 
					System.out.println(accno[i] + "\t" + name[i] + "\t\t" + bal[i]); 

					// display own exception if balance < 1000 
					if (bal[i] < 1000) 
					{ 
						throw new User_Defined_Exception("Balance is less than 1000"); 
					} 
				} 
			} //end of try 
			catch (User_Defined_Exception e)
			{ 
					e.printStackTrace(); 
			} 
	} 
}


