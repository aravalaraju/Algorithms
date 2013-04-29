//******************************************************************************
// Author: Cristina Grama
// Date: 29.04.2013
// Description: Simple non-directed graph
//******************************************************************************
package eu.acg.datastructures;

public class SimpleGraph {
	private int[][] g;
	private int n;
	
	/**
	 * Creates a graph with n nodes
	 * @param n
	 */
	public SimpleGraph(int n)
	{
		this.n = n;
		g = new int[n][n];
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
			{
				g[i][j] = 0;
				g[j][i] = 0;
			}
	}
	
	/**
	 * Connects nodes p and q
	 * @param p
	 * @param q
	 */
	public void connect(int p, int q)
	{
		g[p][q] = 1;
		g[q][p] = 1;
	}
	
	/**
	 * Prints the graph matrix
	 */
	public void print()
	{
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SimpleGraph sg = new SimpleGraph(4);
		sg.connect(0, 1);
		sg.connect(0, 2);
		sg.connect(0, 3);
		sg.connect(1, 2);
		sg.connect(1, 3);
		sg.print();
	}

}
