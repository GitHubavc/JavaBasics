package JavaPrograms;

public class MaxMinElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {50,30,10,78,110,22,190};
		
		int max = a[0];
		
		for (int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The max num is : " +max);
		
		
		int min = a[0];
		
		for (int i=1;i<a.length;i++) {
			
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("The min num is : " +min);
		
	}

}
