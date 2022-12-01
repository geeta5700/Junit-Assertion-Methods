package junitAssertMethods;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;


	class ByteArrayTest {

		ByteArray array = new ByteArray();

		@Test
		@DisplayName("Here we are comparing arrays of byte numbers with positive test case")
		public void ascendingArraytest1() {
			
			byte[] numbers = {23,55,34,56,5,70,10};
			byte[] expected = {5,10,23,34,55,56,70};
			
			assertArrayEquals(expected,array.ascendingOrder(numbers),()->"Test passed as Expected byte array and Actual byte array are equal");
			
		}
		
		@Test
		@DisplayName("Here we are comparing arrays of byte numbers with negative test case")
		public void ascendingArraytest2() {
	        byte[] numbers = {23,55,34,56,5,70,10,71};
			byte[] expected = {5,10,23,34,55,56,71,70};
			
			assertArrayEquals(expected,array.ascendingOrder(numbers), ()->"Test Failed as Expected byte array and Actual byte array are Different");
			
		}
	} 



