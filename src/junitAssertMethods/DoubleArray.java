package junitAssertMethods;//method for assertArrayEquals test of double array 

public class DoubleArray {
	
	public void printArray(double[] input) {
		for( int i=0; i< input.length;i++) {
			System.out.println(input[i]+"  ");
		}
	}
	
	public double[] returnFloatArray() {
		double[] arr = new double[] {1.21,3.25,4.345,6.234,5.4,3.14};
		return arr;
	}

}
