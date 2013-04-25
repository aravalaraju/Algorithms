//******************************************************************************
// Author: Cristina Grama
// Date: 25.04.2013
// Description: http://ww2.codechef.com/problems/HS08TEST
//******************************************************************************
package eu.acg.algorithms;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double cash = reader.nextDouble();
		double crt_balance = reader.nextDouble();
		
		if ((cash % 5 == 0) && (cash + 0.5 < crt_balance))
			crt_balance = crt_balance - (cash + 0.5);
	
		System.out.println(crt_balance);
	}
}
