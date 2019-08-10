package com.giaco.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write an algorithm to determine the GCD of N positive integers.
 * 
 * INPUT
 * The input to the function/methos consists of two arguments -
 * num, an integer representing the number of positive integers (N).
 * arr, a list of positive integers.
 * 
 * OUTPUT
 * Return an integer representing the CGD of the given positive integers.
 * 
 * @author Giacomo
 *
 */
public class Test101 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		int num = 5;
		int output = generalizedGCD(num, arr);
		System.out.println(output);
	}

    public static int generalizedGCD(int num, int[] arr)
    {
    	List<Integer> values = new ArrayList<>();
    	for (int i = 0; i<num; i++) {
        	int position = i+1;
        	if (i == num-1)
        		position = 0;
        	values.add(gcd(arr[i], arr[position]));
    	}
    	return Collections.min(values);
    }
	
    public static int gcd(int a, int b) {
    	if (a == 0)
    		return b;
    	
    	return gcd(b % a, a);
    }
    
}
