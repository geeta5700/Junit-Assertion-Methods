package junitAssertMethods;//method for assertArrayEquals test of short array 

import java.util.Arrays;import java.util.Arrays;
import java.util.Collections;

public class ShortArray {
	public Short[] descendingOrder(Short[] input) {
		Short[] descending = new Short[input.length]; 
		for (int i=0; i< input.length;i++) {
			descending[i]= input[i];
		}
	    Arrays.sort(descending, Collections.reverseOrder());
	    Arrays.toString(descending);
	    return descending;
	}


}

