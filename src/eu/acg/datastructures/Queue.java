//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Queue implementation
//******************************************************************************
package eu.acg.datastructures;

public class Queue {
	private DoubleLinkedList q;
	private int back, front;
	
	public Queue()
	{
		back = 0;
		front = 0;
	}

	public void enqueue(int val)
	{
//		q.addAtFront(val);
	}
	
	public int dequeue()
	{
		return 0;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();

	}
}
