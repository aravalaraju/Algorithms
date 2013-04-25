//******************************************************************************
// Author: Cristina Grama
// Date: 25.04.2013
// Description: http://ww2.codechef.com/problems/FCTRL
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;

public class FactorialTrailingZeros {

	public static int TrailingZeros(int val)
	{
		int zeros = 0;
		
		// Find the k for the summing
		int k = 0;
		while (Math.pow(5, k) < val) k++;
		
		for (int i=1; i<k; i++)
			zeros += Math.floor(val / Math.pow(5, i));
		
		return zeros;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] zeros = new int[n];
		int val;
		for (int i=0; i<n; i++)
		{
			val = reader.nextInt();
			zeros[i] = TrailingZeros(val);
		}
		
		for (int i=0; i<n; i++)
			System.out.println(zeros[i]);			
	}
}
