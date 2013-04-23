//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Queue implementation
//******************************************************************************
package eu.acg.datastructures;

public class Queue {
	private DoubleLinkedList q;
	
	public Queue()
	{
		q = new DoubleLinkedList();
	}

	/**
	 * Enqueue value: add at the beginning of the doubly linked list
	 * @param val
	 */
	public void enqueue(int val)
	{
		q.insertBeginning(val);
	}
	
	/**
	 * Dequeue value: delete from the end of the doubly linked list
	 * @return
	 */
	public int dequeue()
	{
		int val = q.getTail().getValue();
		q.deleteEnd();
		return val;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(5);
		queue.q.print();
		queue.enqueue(8);
		queue.q.print();
		queue.enqueue(2);
		queue.q.print();
		queue.dequeue();
		queue.q.print();
		queue.enqueue(9);
		queue.q.print();
		queue.dequeue();
		queue.q.print();
	}
}
