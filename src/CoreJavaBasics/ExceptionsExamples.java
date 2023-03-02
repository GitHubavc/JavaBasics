package CoreJavaBasics;

public class ExceptionsExamples {

	public static void main(String[] args) {

		System.out.println("Program is started");
		System.out.println("Program is in progress");

		/*
		int a = 100;

		try {
			System.out.println(a / 0); // throws arithmatic exception
		} catch (ArithmeticException e)

		{
			System.out.println("Entered into catch block");
		}
		*/

		String s = null;
		
		try {
		System.out.println(s.length()); // throws null pointer exception
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		}
		
		
		String x = "abc";
		// int i= Integer.parseInt(x); //throws number format exception

		int arr[] = new int[5];
		// arr[10]=100; // throws array out of bound exception

		System.out.println("Program is executed");
		System.out.println("Program is in exited");

	}

}
