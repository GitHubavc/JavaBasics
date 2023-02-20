package CoreJavaBasics;

public class OopsStudent {
	
	int sid;
	String sname;
	char grade;
	
	OopsStudent(int id,String name,char g) {
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	void getValues(int id,String name,char g) {
		
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	void display(){
		
		System.out.println(sid+ "  " +sname+ "   " +grade);
	}

}
