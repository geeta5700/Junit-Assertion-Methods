package junitAssertMethods;//method for assertArrayEquals test of character array 

import java.util.Arrays;

public class CharArray {
	
	public char[] returnCharArray(String input) {
		char[] ch = input.toCharArray();
		for (int i=0; i< input.length();i++) {
			ch[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		return ch;
	}

}
