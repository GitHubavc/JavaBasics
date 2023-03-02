package CoreJavaBasics;

public class ThisKeyword {
	
	int a,b; //class variables
	
	void getValues (int a,int b) //method variable 
	{
		this.a=a;
		this.b=b; // "this" always belong to class variable
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
	
		ThisKeyword th=new ThisKeyword();
				th.getValues(10, 20);
				th.printValues();
				
	}

}
