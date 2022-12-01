package junitAssertMethods;//method for assertArrayEquals test of an Integer Array 
public class IntArray {
	
	// each pixel has the range from [0, 255] 
	
	public void dim (int[] rgbArray) {
		rgbArray[0] = Math.max(0, rgbArray[0]-1); //red
		rgbArray[1] = Math.max(0, rgbArray[1]-1); //green
		rgbArray[2] = Math.max(0, rgbArray[2]-1); // blue
	}
	
	public void brighten (int[] rgbArray) {
		rgbArray[0] = Math.min(255, rgbArray[0]+1); //red
		rgbArray[1] = Math.min(255, rgbArray[1]+1); //green
		rgbArray[2] = Math.min(255, rgbArray[2]+1); // blue
		
	}

}
