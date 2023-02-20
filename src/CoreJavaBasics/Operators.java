package CoreJavaBasics;

public class Operators {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=20;
		
		// arithmatic operator
	
		System.out.println("---------Arithmatic operators--------");
		
		System.out.println("Sum of a and b = " +(a+b));
		System.out.println("Diff of a and b = " +(a-b));
		System.out.println("Mul of a and b = " +(a*b));
		System.out.println("Div of a and b = " +(a/b));
		System.out.println("Mod of a and b = " +(a%b));
		
		
		//Relational Operators
		//always returns boolean value
		System.out.println("---------Relational operators--------");
		
		System.out.println(a==b); //false
		System.out.println(a>b);// true
		System.out.println(a<b);//false
		System.out.println(a>=b); //true
		System.out.println(a<=b);//false
		System.out.println(a!=b);//true
		
		//Logical operators
		//works between 2 boolean values
		
		boolean x=true;
		boolean y=false;
		System.out.println("---------Logical operators--------");
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
			//incriment/decremental operator
		System.out.println("---------Inc/dec operators--------");	
		a=10;
		a++;
		System.out.println(a);
		
		b=20;
		b--;
		System.out.println(b);
		
		//Assignment Operators Using "="
	}

}
