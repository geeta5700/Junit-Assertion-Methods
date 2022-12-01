package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShortArrayTest {
	
ShortArray arraycompare = new ShortArray();
	
	@Test
	@DisplayName("Here we are comparing arrays of short numbers with positive test case")
	public void descendingArraytest1() {
		
		Short[] numbers = {23,55,34,56,5,70,10};
		Short[] expected = {70,56,55,34,23,10,5};
		
		assertArrayEquals(expected,arraycompare.descendingOrder(numbers),()->"Test Passed as Expected short array and Actual short array are Equal");
		
	}
	
	@Test
	@DisplayName("Here we are comparing arrays of short numbers with negative test case")
	public void descendingArraytest2() {
		Short[] numbers = {23,55,34,56,5,70,10};
		Short[] expected = {5,10,23,34,55,56,70};
		
		assertArrayEquals(expected,arraycompare.descendingOrder(numbers), ()->"Test Failed as Expected short array and Actual short array are Different");
		
	}
}
