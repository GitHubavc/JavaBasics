package CoreJavaBasics;

import java.rmi.AccessException;

public class FinallyBlock {

	public static void main(String[] args) {
	
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		
		int a = 100;

		try {
			System.out.println(a / 0); // throws arithmatic exception
		} 
		catch (ArithmeticException e)

		{
			System.out.println("Entered into CATCH block");
		}
		finally
		{
			System.out.println("Entered into FINALLY block");
		}
		
		System.out.println("Program is executed");
		System.out.println("Program is in exited");

		
	}

}
