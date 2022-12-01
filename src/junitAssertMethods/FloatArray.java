package junitAssertMethods; //method for assertArrayEquals test of float array 


public class FloatArray {
	
	public float[] reverseFloatArray(float[] input) {
		float[] reverseArray = new float[input.length];
		for(int i=0, j= reverseArray.length-1; i< input.length; i++, j--) {
				reverseArray[j]= input[i];
		}
		return reverseArray;
		
	}

}
