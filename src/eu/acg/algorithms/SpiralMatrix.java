//******************************************************************************
// Author: Cristina Grama
// Date: 24.04.2013
// Description: Print the elements of a matrix in a spiral.
// Example: 1 2 3
//          8 9 4   => "1, 2, 3, 4, 5, 6, 7, 8, 9"
//          7 6 5
//******************************************************************************
package eu.acg.algorithms;

public class SpiralMatrix {
	private int dim; 
	private int[][] m;
	
	public SpiralMatrix(int[][] mat, int dim)
	{
		this.m = mat;
		this.dim = dim;
	}
	
	/**
	 * Prints values going in a certain direction and within certain boundaries
	 * @param direction
	 * @param rowmin
	 * @param rowmax
	 * @param colmin
	 * @param colmax
	 */
	public void printValues(int direction, int rowmin, int rowmax, int colmin, int colmax) 
	{
		if (direction == 0) 
			// Going north, we stick to the column and decrease the row 
			for (int i = rowmax-1; i >= rowmin; i--)
				System.out.print(m[i][colmin] + " ");
		else
			if (direction == 2)
				// Going south, we stick to the column and increase the row 
				for (int i = rowmin; i < rowmax; i++)
					System.out.print(m[i][colmax-1] + " ");
		else
			if (direction == 1)
				// Going east, we stick to the row and increase the column 
				for (int j = colmin; j < colmax; j++)
					System.out.print(m[rowmin][j] + " ");			
		else
			if (direction == 3)
				// Going west, we stick to the row and decrease the column 
				for (int j = colmax-1; j >= colmin; j--)
					System.out.print(m[rowmax-1][j] + " ");			
	}
	
	/**
	 * Traverse the matrix in a spiral pattern
	 */
	public void traverseSpiral()
	{
		/*
		 * The directions are encoded as follows:
		 * 0 - N
		 * 1 - E
		 * 2 - S
		 * 3 - W
  		*/
		int direction = 1; // We start by going east
		int rowmin = 0;
		int rowmax = dim;
		int colmin = 0;
		int colmax = dim;
		
		while (rowmin <= rowmax)
		{
			printValues(direction, rowmin, rowmax, colmin, colmax);
			
			// We increase the min row after we've gone east
			if (direction == 1)	rowmin += 1;
			// We decrease the max row after we've gone west
			if (direction == 3)	rowmax -= 1;
			// We increase the min column after we've gone north
			if (direction == 0)	colmin += 1;
			// We decrease the max column after we've gone south
			if (direction == 2) colmax -= 1;
			// Get the next direction
			direction = (direction + 1) % 4;
			
//			System.out.print("New values:");
//			System.out.print(" Direction:" + direction);
//			System.out.print(" Rowmin:" + rowmin);
//			System.out.print(" Rowmax:" + rowmax);
//			System.out.print(" Colmin:" + colmin);
//			System.out.println(" Colmax:" + colmax);			
		}
	}
	
	public static void main(String[] args) 
	{
		int[][] m = new int[3][3];
		int dim = 3;
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 8;
		m[1][1] = 9;
		m[1][2] = 4;
		m[2][0] = 7;
		m[2][1] = 6;
		m[2][2] = 5;
		
//		int[][] m = new int[4][4];
//		int dim = 4;
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[0][2] = 3;
//		m[0][3] = 4;
//		m[1][0] = 12;
//		m[1][1] = 13;
//		m[1][2] = 14;
//		m[1][3] = 5;
//		m[2][0] = 11;
//		m[2][1] = 16;
//		m[2][2] = 15;
//		m[2][3] = 6;
//		m[3][0] = 10;
//		m[3][1] = 9;
//		m[3][2] = 8;
//		m[3][3] = 7;

		SpiralMatrix sm = new SpiralMatrix(m, dim);
		sm.traverseSpiral();
	}
}
