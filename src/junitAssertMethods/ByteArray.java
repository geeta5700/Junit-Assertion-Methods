package junitAssertMethods; //method for assertArrayEquals test of byte array 

import java.util.Arrays;

public class ByteArray {
	
	public byte[] ascendingOrder(byte[] numbers) {
		byte[] ascending = new byte[numbers.length]; 
		for (int i=0; i< numbers.length;i++) {
			ascending[i]= numbers[i];
		}
	    Arrays.sort(ascending);
	    return ascending;
	}

}
