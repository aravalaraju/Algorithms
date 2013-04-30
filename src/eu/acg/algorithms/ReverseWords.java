//******************************************************************************
// Author: Cristina Grama
// Date: 30.04.2013
// Description: http://code.google.com/codejam/contest/351101/dashboard#s=p1
//******************************************************************************
package eu.acg.algorithms;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseWords {

	public static String reversedTokens(String s)
	{
		String revs = "";
		Stack<String> stack = new Stack<String>();
		int space_position = 0;
		while (!s.isEmpty())
		{
			space_position = s.indexOf(" ");
			if (space_position != -1)
			{
				stack.push(s.substring(0, space_position));
				s = s.substring(space_position + 1);
			}
			else
			{
				stack.push(s);
				s = "";
			}
		}
		
		while (!stack.empty())
			revs += stack.pop() + " ";
		
		return revs;
	}
	
	public static void main(String[] args) {
		BufferedReader br;
		BufferedWriter bw;
		String is = "";
		int nr_cases = 0;
		try
		{
			br = new BufferedReader(new FileReader("E:\\Dev\\Algorithms\\input\\ReverseWords_B-large-practice.in"));
			bw = new BufferedWriter(new FileWriter("E:\\Dev\\Algorithms\\input\\ReverseWords_B-large-practice.out"));
			
			nr_cases = Integer.parseInt(br.readLine());
			int i = 0;
			while (i < nr_cases)
			{
				is = br.readLine();
				bw.write("Case #" + (i + 1) + ": " + reversedTokens(is) + "\n");
				i++;
			}
			bw.close();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Input file not found!");
		}
		catch (IOException ioe)
		{
			System.out.println("Cannot read from input file!");			
		}
	}
}
