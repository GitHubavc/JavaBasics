package CoreJavaBasics;

public class Animal {

	
	String color ="white";
	
	void eating()
	{
		System.out.println("Eating........");
	}
	
	Animal()
	{
		System.out.println("Animal is created");
	}
	
}

class Dog extends Animal {

	
	String color ="Black";
	
	/*
	void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	*/
	
	/*
	void eating()
	{
		System.out.println("Eating Bread........");
		super.eating();
	}
	*/
	
	Dog()
	{
		super();
		System.out.println("Dog is created");
	}
	
	
}

