package junitAssertMethods;//Method for AsserTrue Test  

// import java.util.Scanner;

public class StringUtilities {
	private String s;
	
	public boolean isUpperCase(String s) {
		//Scanner sc = new Scanner (System.in);
		//System.out.print("\nEnter a word:\t");
		char ch = s.charAt(0);
		System.out.print("\nThe first character is:");
		
		if (ch >= 'a'&& ch <= 'z') {
			System.out.print("Lower Case\n");
			return false;
		}
		System.out.print("Upper Case\n");
		return true;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
