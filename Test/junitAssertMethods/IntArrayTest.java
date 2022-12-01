package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntArrayTest {
	
IntArray graphic = new IntArray();
	
	@Test 
	@DisplayName("Here we are comparing arrays of integer numbers with positive test case")
	 public void testDim() {
		int[] pixel= {1,2,3};
		graphic.dim(pixel);
		int[] expected = {0,1,2};
		assertArrayEquals(expected, pixel);
		graphic.dim(pixel);
		expected = new int[] {0,0,1}; // should not go below 0
		assertArrayEquals(expected, pixel,()->"Test Passed as Expected integer array and Actual integer array are Equal");
	  }
	
	@Test 
	@DisplayName("Here we are comparing arrays of integer numbers with positive test case")
	  public void testBrighten() {
		int[] pixel= {0,253,254};
		graphic.brighten(pixel);
		int[] expected = {1,254,255};
		assertArrayEquals(expected, pixel);
		graphic.brighten(pixel);
		expected = new int[] {2,255,255}; // should not go above 255
		assertArrayEquals(expected, pixel,()->"Test Passed as Expected integer array and Actual integer array are Equal");
	  }
	@Test 
	@DisplayName("Here we are comparing arrays of integer numbers with negative test case")
	  public void testDim1() {
		int[] pixel= {1,2,3};
		graphic.dim(pixel);
		int[] expected = {0,1,2};  // should not go below 0
		assertArrayEquals(expected, pixel, "Arrays are not equal");
		graphic.dim(pixel);
		expected = new int[] {-1,0,1}; 
		assertArrayEquals(expected, pixel, ()->"Test Failed as Expected integer array and Actual integer array are Different");
	  }
	
	@Test 
	@DisplayName("Here we are comparing arrays of integer numbers with negative test case")
	  public void testBrighten1() {
		int[] pixel= {0,253,254};
		graphic.brighten(pixel);
		int[] expected = {1,254,255}; // should not go above 255
		assertArrayEquals(expected, pixel, "Arrays are not equal");
		graphic.brighten(pixel);
		expected = new int[] {2,255,256}; 
		assertArrayEquals(expected, pixel, "()->Test Failed as Expected integer array and Actual integer array are Different");
	  }
}
