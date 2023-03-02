package CoreJavaBasics;

public class OopsConstructorOverloading {
	
	OopsConstructorOverloading(int a , int b)
	{
		System.out.println(a+b);
	}
	
	OopsConstructorOverloading(int a , double b)
	{
		System.out.println(a * b);
	}
	
	OopsConstructorOverloading(double  a , double b)
	{
		System.out.println(a / b);
	}
	
	OopsConstructorOverloading(int a , int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		

		OopsConstructorOverloading co = new OopsConstructorOverloading(10,10.8);

	}

}
