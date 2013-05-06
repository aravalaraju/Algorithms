//******************************************************************************
// Author: Cristina Grama
// Date: 06.05.2013
// Description: You have a set of integers between 1 .. n in a random order with 
// one of the numbers being repeated. Find the best possible way (time and 
// space) to obtain the repeating number.
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class RepeatingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		int n;
		System.out.println("How many numbers?");
		n = scan.nextInt();
		
		int i = 0, val = 0;
		while (i < n)
		{
			val = scan.nextInt();
			if (!m.containsKey(val)) m.put(val, 1);
			else
			{
				System.out.println("Double value: " + val);
				i = n;
			}
			i++;
		}
		
		scan.close();
	}
}
