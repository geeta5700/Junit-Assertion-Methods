package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FloatArrayTest {
	FloatArray arraycompare = new FloatArray();
	@Test
	@DisplayName("Here we are comparing arrays of float numbers with negative test case")
	public void reverseFloatArraytest1() {
		float[] temp = {0.2f, 1.2f, 2.2f, 3.2f, 4.2f, 5.2f};
		float[] expected = {5.2f, 4.2f, 3.2f, 2.2f, 1.2f, 0.2f};
		assertArrayEquals(expected, arraycompare.reverseFloatArray(temp),()->"Test Passed as Expected float array and Actual float array are equal");
		
	}
	@Test
	@DisplayName("Here we are comparing arrays of float numbers with negative test case")
	public void reverseFloatArraytest2() {
		float[] temp = {0.2f, 1.2f, 2.2f, 3.2f, 4.2f, 5.2f};
		float[] expected = {5.2f, 4.2f, 3.2f, 2.2f, 0.2f, 1.2f};
		assertArrayEquals(expected, arraycompare.reverseFloatArray(temp), ()->"Test Failed as Expected float array and Actual float array are Different");	
	}
}
