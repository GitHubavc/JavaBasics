package CoreJavaBasics;

public class OopsCalculation {
	
	
	int x = 10;
	int y=20;
	
	/*
	//1) method with no return and no parametres
	void sum() {
		
		System.out.println("The Sum of them is : " +(x+y));
	}
	*/
	
	/*
	//2) method with  return and no parametres
	 int sum() {
		
		return (x+y);
	}
	*/
	
	/*
	//3) method with  NO return and has parametres
	 void sum(int a,int b) {
		
		System.out.println(a+b);
	}
	*/
	
	//4) method with   return and has parametres
	 int sum(int a,int b) {
		
		
		return (a+b);
	}
	
	public static void main(String args[]) {
		
		OopsCalculation cal = new OopsCalculation();
		
		//cal.sum(); //case 1
		
		/*
		int res=cal.sum();
		System.out.println(res); //case 2
		
		*/
		
		/*
		cal.sum(25,60); //case 3
		
		*/
		
		System.out.println(cal.sum(22, 33)); //case 4
		
		
		
	}

}
