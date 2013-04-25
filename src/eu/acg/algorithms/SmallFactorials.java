//******************************************************************************
// Author: Cristina Grama
// Date: 25.04.2013
// Description: http://ww2.codechef.com/problems/FCTRL2
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;

public class SmallFactorials {

	public static double factorial(double n)
	{
		if (n == 0) return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		double[] f = new double[n];
		int val;
		double res;
		for (int i=0; i<n; i++)
		{
			val = reader.nextInt();
			res = factorial(val);
			f[i] = res;
		}
		for (int i=0; i<n; i++)
			System.out.println(f[i]);
	}
}
