package CoreJavaBasics;


class A // A is parent class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A // B is child class A //single level inheritance
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B // C is child class B //Multi level inheritance
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}



public class OopsInheritance {
	
	

	public static void main(String[] args) {
		
		/*
		A aobj = new A();
		aobj.a =100;
		aobj.display();
		
		B bobj =new B(); //single level inheritance
		bobj.a =10;
		bobj.b=20;
		
		bobj.display();
		bobj.print();
		*/
		
		C cobj = new C(); //Multi level inheritance
		cobj.a=10;
		cobj.b= 20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();
	

	}

}
