//******************************************************************************
// Author: Cristina Grama
// Date: 25.04.2013
// Description: http://ww2.codechef.com/problems/TEST
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;

public class CodeChefTest {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Integer n = 0;
		do
		{
			n = reader.nextInt();
			if (n != 42) System.out.println(n);
		}
		while (n != 42);
	}
}
