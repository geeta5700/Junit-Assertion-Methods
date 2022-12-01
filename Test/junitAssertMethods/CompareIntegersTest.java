package junitAssertMethods;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CompareIntegersTest {

	CompareIntegers compareint = new CompareIntegers();
			@Test 
			@DisplayName ("Here we are using assertFalse by comparing to integer values-positive test case")
			public void compareIntegerstest1() {
				
				Assertions.assertFalse(compareint.compareIntegers(15, 25),()->"Test Passed because it generated true value as int a < int b");
			}
			
			@Test 
			@DisplayName ("Here we are using assertFalse by comparing to integer values-negative test case")
			public void compareIntegerstest2() {
				
				Assertions.assertFalse(compareint.compareIntegers(100,10),()-> "Test failed because it generated true value as int a > int b");
						
			}

		}


