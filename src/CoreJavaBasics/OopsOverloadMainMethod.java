package CoreJavaBasics;

public class OopsOverloadMainMethod {
	
	public void  main(int x)
	{
		System.out.println(x);
	}
	
	public void  main(int x, int y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		OopsOverloadMainMethod om = new OopsOverloadMainMethod();
		
				om.main(100);
				om.main(100,300);

	}
	

}
