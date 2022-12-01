package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
BankAccount bankaccount = new BankAccount();
	
	@Test 
	@DisplayName("assertNotNull object check - Positive Scenario")
	public void testHolderNameSet1() {
		bankaccount.setHolderName("Geeta");
		assertNotNull(bankaccount.getHolderName(),()->"assertNotNull test passed because it sets the holder name");
	}
	
	@Test 
	@DisplayName("assertNotNull object check - negative Scenario")
	public void testHolderName2() {
		assertNotNull(bankaccount.getHolderName(),()->"assertNotNull test failed because didnot set any holder name");
	}

}