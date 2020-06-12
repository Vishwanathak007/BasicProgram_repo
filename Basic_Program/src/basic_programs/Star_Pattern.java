package basic_programs;

import java.util.Scanner;

public class Star_Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		System.out.println("**********************Type1******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("**********************Type2******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("**********************Type3******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j = rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type4******************");
		for(int i=1; i<=rows; i++)
		{
			for(int k=1; k<=i-1; k++)
			{
				System.out.print(" ");
			}
			for(int j = rows; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type5******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("**********************Type6******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j = rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j = rows - 1; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type7******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j = rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("**********************Type8******************");
		for(int i=1; i<=rows; i++)
		{
			for(int k=1; k<=i-1; k++)
			{
				System.out.print(" ");
			}
			for(int j = rows; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("**********************Type9******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j = rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j = rows -1; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("**********************Type10******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type11******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l=rows-1; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type12******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l=rows-2; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************Type13******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(i == j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type14******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(i +j == (rows+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type15******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if((i +j == (rows+1)) || (i == j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type16******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				if(k == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=1; l<=i-1; l++)
			{
				if(l == i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type17******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				if(k == rows)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=rows-1; l>=i; l--)
			{
				if(i == l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type18******************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				if(k == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=1; l<=i-1; l++)
			{
				if(l == i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				if(k == rows-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=rows-2; l>=i; l--)
			{
				if(i == l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("**********************Type19******************");
		for(int i=1; i<=rows; i++)
		{
			if((i == 1) || (i== rows))
			{
				for(int j=1; j<=rows; j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int k=1; k<=rows; k++)
				{
					if((k==1)||(k==rows))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
		scan.close();
	}
}
