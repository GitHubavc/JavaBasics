package CoreJavaBasics;


interface ABC
{
	int x=100;
	void m1();
}


interface CDE
{
	int y=200;
	void m2();
}


public class OopsMultipleInheritance implements ABC,CDE

{
	
	public void m1() {
		
		System.out.println(x);
	}
	
public void m2() {
		
		System.out.println(y);
	}
	
	

	public static void main(String[] args) {
		
		OopsMultipleInheritance  test = new OopsMultipleInheritance();
		
		test.m1();
		test.m2();


	}

}
