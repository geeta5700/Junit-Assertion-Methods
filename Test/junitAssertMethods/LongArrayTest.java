package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongArrayTest {
LongArray arraycompare = new LongArray();
	
	@Test
	@DisplayName("Here we are comparing arrays of long numbers with positive test case")
	public void getArraytest1() {
		
		long[] numbers = {23000,55,34,560000,500,70000,10};
		long[] expected = {23000,55,34,560000,500,70000,10};
		
		assertArrayEquals(expected,arraycompare.getArray(numbers),()->"Test Passed as Expected long array and Actual long array are Equal");
		
	}
	
	@Test
	@DisplayName("Here we are comparing arrays of long numbers with positive test case")
	public void getArraytest2() {
		
		long[] numbers = {23000,55,34,560,5,700,100};
		long[] expected = {23000,55,34,560,700,100,5};
		
		assertArrayEquals(expected,arraycompare.getArray(numbers),()->"Test Failed as Expected long array and Actual long array are Different");
		
	}

}
