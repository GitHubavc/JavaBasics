package CoreJavaBasics;

public class OopsEmployeeMain {
	
	
	public static void main(String args[]) {
		
		
		//object is an instance of a class
		//block of code which has a logic is Method
		
		OopsEmployee emp1= new OopsEmployee(); //creation of object
		emp1.eid =101;
		emp1.name="Amit";
		emp1.salary= 12000;
		emp1.depno=10;
		emp1.Job="Manager";
		emp1.display();
		
		OopsEmployee emp2= new OopsEmployee(); //creation of object
		emp2.eid =102;
		emp2.name="david";
		emp2.salary= 14000;
		emp2.depno=10;
		emp2.Job="Architect";
		emp2.display();
		
	}

}
