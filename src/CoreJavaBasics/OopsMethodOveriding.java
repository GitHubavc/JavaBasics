package CoreJavaBasics;


class Bank
{
	
	double rateOfInterest()
	{
		return 0;
	}
	
}


class Sbi extends Bank
{
	
	double rateOfInterest()
	{
		return 10.5;
	}
	
}

class Icici extends Bank
{
	
	double rateOfInterest()
	{
		return 8.5;
	}
	
}

class   Axis extends Bank
{
	
	double rateOfInterest()
	{
		return 6.9;
	}
	
}

public class OopsMethodOveriding {

	public static void main(String[] args) {
		
		Sbi sbi= new Sbi();
		System.out.println(sbi.rateOfInterest());
		
		Icici  icici =new Icici();
		System.out.println(icici.rateOfInterest());
		
		Axis axis = new Axis();
		System.out.println(axis.rateOfInterest());
	

	}

}
