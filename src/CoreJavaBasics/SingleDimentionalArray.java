package CoreJavaBasics;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	 int a[]=new int[5];
		 //declared array with size 5
		 
		 a[0]=100;
		 a[1]=200;
		 a[2]=300;
		 a[3]=400;
		 a[5]=500;
		 
		 */
		
		int a[]= {100,200,300,400,500};//also declare an array without size
		
		System.out.println(a.length);//prints length of array
		
		 System.out.println(a[2]);//read a specific value
		 
		 for (int i=0; i<a.length;i++) {
			 
			 System.out.println(a[i]);
			 
		 }
		 
		 //using enhanced for loop
		 
		 for(int i:a) {
			 
			 System.out.println(i);
		 }
		 
		 

				 

	}

}
