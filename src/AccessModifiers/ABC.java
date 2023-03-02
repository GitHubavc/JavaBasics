package AccessModifiers;

public class ABC
{
	
	//PRIVATE
	/*
private int data=10;
private void m1() {}
	*/
	
	//DEFAULT
	/*
	int data=10;
	 void m1() {
		 System.out.println(data);
	 }
	 */
	
	//PROTECTED
	/*
	protected int  data=10;
	 protected void m1() {
		 System.out.println(data);
	 }
	 */
	 
	//PUBLIC
	
	
	public int  data=109;
	 public void m1() {
		 System.out.println(data);
	 }
	 
	 
	 
	 



/*
public class Simple {

	public static void main(String[] args) {

		//PRIVATE: will give compile time error since its private within the class (only within single class)
		//DEFAULT: For default acces modifier can be accesses within package (No access modifier is given its default)
		//PROTECTED : Is access within and outside pakage but through inheritance only.
		//PUBLIC : can access anywhere within the project without inheritance
		
		ABC aobj = new ABC();
		aobj.data=20;
		aobj.m1();

*/
	}
	


