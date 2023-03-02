package CoreJavaBasics;

public class OopsMethodOverloading {

	void add(int a, int b) {

		System.out.println(a + b);
	}

	void add(int a, double b) {

		System.out.println(a * b);
	}

	void add(double a, double b) {

		System.out.println(a / b);
	}

	void add(int a, int b, int c) {

		System.out.println(a + b+c);
	}

	public static void main(String[] args) {

		
		OopsMethodOverloading mo = new OopsMethodOverloading();
		
		mo.add(10, 20);
		mo.add(10, 20,30);
		mo.add(10, 20.5);
		mo.add(10.5, 20.5);
	}

}
