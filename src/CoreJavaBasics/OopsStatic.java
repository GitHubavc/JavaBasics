package CoreJavaBasics;

public class OopsStatic {
	
	static int a= 10;  //static variable
	int b = 20; // Non static variable
			
			static void m1() //static method
			{ 
				System.out.println("This is M1- static method");
			}
			
			 void m2() 
			 {
				System.out.println("This is M2-  Non static method");
			}
			 
			 void m3() 
			 {
				 System.out.println("this is M3 - Non static method");
				System.out.println(a);
				System.out.println(b);
				m1();
				m2();
			}
	
	


	public static void main(String[] args) {
		
		//static methods can access only static stuff	
		//static methods can be  called without creating an Object
		
		System.out.println(a);
		m1();
		
		
		
		
		// Non static methods can be only called by creating an Object

		OopsStatic os = new OopsStatic();
		int value =os.b;
		System.out.println(value);
		os.m2();
		os.m3();
		
		
	}

}
