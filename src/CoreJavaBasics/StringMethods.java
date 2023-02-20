package CoreJavaBasics;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s="welcome";
		String s1 = " to java";
		
		System.out.println(s.length());
		
		System.out.println(s.concat(s1));
		
		s= "    welcome    ";
		
		System.out.println(s);
		System.out.println(s.trim());
		
		
		
		s= "welcome";
		System.out.println(s.charAt(3));
		
		System.out.println(s.contains("come"));
		
		s= "welcome";
		System.out.println(s.equals("welcomE"));
		
		System.out.println(s.equalsIgnoreCase("welcomE"));
		
		s="Welcome to java";
		
		System.out.println(s.replace('o', 'i'));
				
		System.out.println(s.replace("java","selenium"));
		
		s= "welcome";
		
		System.out.println(s.substring(0,4));
		
		s= "welcome";
		
		System.out.println(s.toUpperCase());
		
		s= "MasteR";
		
		System.out.println(s.toLowerCase());
		
	}

}
