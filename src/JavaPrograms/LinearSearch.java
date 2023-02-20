package JavaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,60,90,50};
		
		int search_ele= 1000;
		boolean flag=false;
		
		for (int i=0; i<a.length;i++)
		
		{
			//System.out.println(a[i]);
			
			if (search_ele==a[i]) {
				System.out.println("Element Found at : " +i);
				flag= true;
				break;
			}
		}
		
		if (flag==false)
		{
		System.out.println("Element Not found");
		}
		

	}

}
