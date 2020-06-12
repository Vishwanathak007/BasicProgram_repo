package custom_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw_concept 
{
	public FileInputStream FIS;
	public static void main(String[] args) throws FileNotFoundException, InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Before Exception");
		File f= new File("E:\\abc.txt");
		try
		{
			Throw_concept obj = new Throw_concept();
			obj.FIS = new FileInputStream(f);
		}
		catch(FileNotFoundException FNF)
		{
			System.out.println("File not found as per location specified");
		}
		System.out.println("After Exception");
	}
}
