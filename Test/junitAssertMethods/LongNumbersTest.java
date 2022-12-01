package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongNumbersTest {
LongNumbers test = new LongNumbers();
	
	@Test
    @DisplayName("assertEquals Long check - Positive Scenario")
    public void AssertingEquality_Positive() {
        
        long output = test.add(141L, 142L);
        assertEquals(283L, output,()->"Test Passed as Expected and Actual are Equal");
    }


    @Test
    @DisplayName("assertEquals Long check - Negative Scenario")
    public void AssertingEquality_Negative() {
        long output = test.add(141L, 142L);
        assertEquals(284L, output,()->"Test Failed as Expected and Actual are Different");
    }

}
