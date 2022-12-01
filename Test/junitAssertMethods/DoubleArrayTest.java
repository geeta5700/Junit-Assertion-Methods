package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DoubleArrayTest {
	
DoubleArray arraycompare =new DoubleArray();
	
	@Test
	@DisplayName("Here we are comparing arrays of double numbers with positive test case")
	public void returnDoubleArraytest1() {
		double[] arr = arraycompare.returnFloatArray();
	    arraycompare.printArray(arr);
	    double[] expected = {1.21,3.25,4.345,6.234,5.4,3.14};
	    assertArrayEquals(expected,arr,()->"Test Passed as Expected double array and Actual double array are Equal");
	}
	
	@Test
	@DisplayName("Here we are comparing arrays of double numbers with negative test case")
	public void returnDoubleArraytest2() { 
		double[] arr = arraycompare.returnFloatArray();
	    arraycompare.printArray(arr);
	    double[] expected = {1.21,3.25,4.345,6.234,5.4,3.24};
	    assertArrayEquals(expected,arr, ()->"Test Failed as Expected double array and Actual double array are Different");
	}
}
