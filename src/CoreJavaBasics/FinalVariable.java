package CoreJavaBasics;

public class FinalVariable {
	
	final int speed= 40; // final cannot be changed

	public static void main(String[] args) {
		
		FinalVariable fm = new FinalVariable();
		 // fm.speed=100; // compile error
		System.out.println(fm.speed);
		

	}

}
