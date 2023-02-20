package JavaPrograms;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,2,7,9,6};
		
		int sum =0;
		
		for (int i=0; i <a.length-1;i++) {  //a.length -1= 4
			
			sum=sum+a[i];
		}
		
		System.out.println("sum of array is : " +sum);

	}

}
