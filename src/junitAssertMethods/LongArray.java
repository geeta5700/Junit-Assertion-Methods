package junitAssertMethods;//method for assertArrayEquals test of long array 

public class LongArray {
	
	public long[] getArray(long[] input) {
		long[] output = new long[input.length];
		for (int i=0;i<input.length; i++) {
			output[i] = input[i];
		}
		return output;
	}

}
