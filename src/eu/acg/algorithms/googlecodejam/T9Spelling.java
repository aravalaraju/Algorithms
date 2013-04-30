//******************************************************************************
// Author: Cristina Grama
// Date: 30.04.2013
// Description: http://code.google.com/codejam/contest/351101/dashboard#s=p2
//******************************************************************************
package eu.acg.algorithms.googlecodejam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class T9Spelling {

	public static String getConversion(String s)
	{
		String res = "";
		int index = 0, group, times_pressed, old_group = -1;
		
		if ((s != null) && (!s.trim().isEmpty()))
		{
			int string_size = s.length();
			char c;
			while (index < string_size)
			{
				// The group is the phone key. Here we count it starting from 0...
				c = s.charAt(index);
				if ((int)c == 32) 
				{
					res += "0";
					group = 0;
				}
				else
				{
					group = (int)Math.floor(((int)c - 97) / 3);
					
					// Adjust for S, V, Y, Z:
					if ((c == 115) || (c == 118) || (c == 121) || (c == 122))
						group--;
					
					// times_pressed shows how many time the group button needs to be pressed
					if (c == 115) times_pressed = 3;
					else
						if (c == 118) times_pressed = 2;
						else
							if (c == 121) times_pressed = 2;
							else
								if (c == 122) times_pressed = 3;
								else
									times_pressed = (int)Math.floor(((int)c - 97) % 3); 
					
					// .. so now we have to update it to start from 2
					group += 2;
					// Here we also start from 0, but it should be from 1
					times_pressed++;
					
					// If we are in the same group as last time, a space is needed
					if (old_group == group)	res += " ";
					old_group = group;
					
					while (times_pressed > 0)
					{
						res += group;
						times_pressed--;
					}
				}
				index++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		BufferedReader br;
		BufferedWriter bw;
		
		try
		{
			br = new BufferedReader(new FileReader("E:\\Dev\\Algorithms\\input\\T9Spelling_C-large-practice.in"));
			bw = new BufferedWriter(new FileWriter("E:\\Dev\\Algorithms\\input\\T9Spelling_C-large-practice.out"));
			
			int nr_cases = Integer.parseInt(br.readLine());
			int i = 0;
			String s;
			while (i < nr_cases)
			{
				s = br.readLine();
				System.out.println("Case #" + i + ": " + s);
				System.out.println("Case #" + i + ": " + getConversion(s));
//				bw.write("Case #" + (i+1) + ": " + getConversion(s) + "\n");
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
