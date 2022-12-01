package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharArrayTest {
CharArray array = new CharArray();
	
	@Test
	@DisplayName("Here we are comparing arrays of characters with positive test case")
	public void StringToCharArraytest1() { 
		
		char[] actual = array.returnCharArray("umbrella");
		char[] expected = {'u','m','b','r','e','l','l','a'};
		assertArrayEquals(expected, actual,()->"Test Passed as Expected character array and Actual character array are Equal");
	}
	@Test
	@DisplayName("Here we are comparing arrays of characters with negative test case")
	public void StringToCharArraytest2() {
		char[] actual = array.returnCharArray("Project Manager");
		char[] expected = {'P','r','o','j','e','c','t','M','a','n','a','g','e','r'};
		assertArrayEquals(expected, actual,()->"Test Failed as Expected character array and Actual character array are Different");
	}
}
