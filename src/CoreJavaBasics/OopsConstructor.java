package CoreJavaBasics;

public class OopsConstructor {

	int x;
	int y;
	
	OopsConstructor(){ //default constructor
		
		x=10;
		y=20;
	}
	
	
	OopsConstructor(int a,int b){ //parameterised constructor
		
		x=a;
		y=b;
	}
	
	void display() {
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OopsConstructor cm1= new OopsConstructor(); //invokes default constructor
		
		OopsConstructor cm = new OopsConstructor(23,77); //invokes parameterised constructor
		
		cm.display();
		cm1.display();
		
		
	}

}
