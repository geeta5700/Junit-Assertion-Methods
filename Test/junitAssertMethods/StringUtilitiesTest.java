package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilitiesTest {
StringUtilities word =new StringUtilities();
	
	@Test 
	@DisplayName("assertTrue boolean condition check - Positive Scenario")
	public void UpperCaseFirstCharacterTest1() {
		
		assertTrue(word.isUpperCase("Apple"),()-> "Test Passed as expression return True value as The first character is Upper Case");	
	}
	
	@Test 
	@DisplayName("assertTrue boolean condition check - Negative Scenario")
	public void UpperCaseFirstCharacterTest2() {

		assertTrue(word.isUpperCase("apple"),()-> "Test Failed as expression return false value as The first character is Lower Case");	
	}


}