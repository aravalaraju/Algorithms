//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Stack implementation
//******************************************************************************
package eu.acg.datastructures;

public class Stack {
	private int[] s; // The stack array
	private int top; // The top of the stack
	private final int MAX_SIZE = 10;

	public Stack()
	{
		s = new int[MAX_SIZE];
		top = 0;
	}
	
	/**
	 * Push the value on top of the stack
	 * @param val
	 */
	public void push(int val)
	{
		if (top == MAX_SIZE)
			System.out.println("Stack full, cannot push!");
		else
		{
			s[top] = val;
			top += 1;
		}
	}
	
	/**
	 * Pop a value from the stack
	 * @return
	 */
	public int pop()
	{
		int val = 0;
		if (isEmpty())
			System.out.println("Stack empty, cannot pop!");
		else
		{
			val = s[top];
			top = top - 1;
		}
		return val;
	}
	
	/**
	 * Test whether the stack is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		return (top == 0);
	}

	/**
	 * Print the stack
	 */
	public void print()
	{
		if (isEmpty())
			System.out.print("Stack is empty!");
		else
			for (int i=0; i<top; i++)
				System.out.print(s[i] + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.print();
		stack.push(6);
		stack.print();
		stack.push(4);
		stack.print();
		stack.push(8);
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
	}
}