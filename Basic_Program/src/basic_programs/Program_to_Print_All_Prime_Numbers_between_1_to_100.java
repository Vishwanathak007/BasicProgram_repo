package basic_programs;

import java.util.Scanner;

public class Program_to_Print_All_Prime_Numbers_between_1_to_100 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Range1");
		Scanner scan = new Scanner(System.in);
		int Range1 = scan.nextInt();
		System.out.println("Enter the Range2");
		int Range2 = scan.nextInt();
		boolean status = true;
		for(int i=Range1; i<=Range2; i++)
		{
			if(i == 1)
			{
				continue;
			}
			else
			{
				for(int j=2; j<=i/2; j++)
				{
					if(i % j == 0)
					{
						status = false;
						break;
					}
					else
					{
						status = true;
					}
				}
				if(status == true)
				{
					System.out.println(i);
				}
			}	
		}
		scan.close();
	}
}
