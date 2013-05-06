//******************************************************************************
// Author: Cristina Grama
// Date: 06.05.2013
// Description: Given an array of integers such that each element is either +1 
// or -1 to its preceding element. Find 1st occurrence of a given number in 
// that array without using linear search.
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, target_val;
		System.out.println("What is the target value?");
		target_val = scan.nextInt();
		System.out.println("How many elements in the array?");
		n = scan.nextInt();
		
		int[] array = new int[n];
		
		int i = 0;
		while (i < n)
		{
			array[i] = scan.nextInt();
			i++;
		}
		
		scan.close();
		
		int pos = 0, crt_val = array[0];
		
		while ((crt_val != target_val) && (pos < n))
		{
			pos += Math.abs(crt_val - target_val);
			if (pos < n) crt_val = array[pos];
		}
		
		if (pos < n) System.out.println(target_val + " appears first time on position " + pos);
		else
			System.out.println(target_val + " does not appear in the array!");
	}
}
