package CoreJavaBasics;

interface I
{
  int a = 10; // by default variables in interface is static and final
  
  void m1(); //abstract method, by default its public
}

public class Test  implements I

{
	public void m1()
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {

		
		
		I a = new Test();
		a.m1();
		

	}

}
