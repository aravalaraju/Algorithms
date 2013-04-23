//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Double Linked List implementation
//******************************************************************************
package eu.acg.datastructures;

class DoubleNode
{
	private int val; // The value in the node
	private DoubleNode prev; // Reference to the previous node 
	private DoubleNode next; // Reference to the next node
	
	public DoubleNode(int value)
	{
		val = value;
		prev = null;
		next = null;
	}
	
	public int getValue()
	{
		return val;
	}
	
	public DoubleNode getPrev()
	{
		return prev;
	}
	
	public DoubleNode getNext()
	{
		return next;
	}
	
	public void setPrev(DoubleNode node)
	{
		prev = node;
	}

	public void setNext(DoubleNode node)
	{
		next = node;
	}
}

public class DoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;
	
	public DoubleLinkedList()
	{
		head = null;
		tail = null;
	}

	/**
	 * Inserts the value at the beginning of the list
	 * @param val
	 */
	public void insertBeginning(int val)
	{
		if (isEmpty())
		{
			head = new DoubleNode(val);
			tail = head;
		}
		else
		{
			DoubleNode newNode = new DoubleNode(val);
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
		}
	}

	/**
	 * Insert the value at the end of the list
	 * @param val
	 */
	public void insertEnd(int val)
	{
		if (isEmpty())
		{
			head = new DoubleNode(val);
			tail = head;
		}
		else
		{
			DoubleNode newNode = new DoubleNode(val);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	/**
	 * Tests whether the list is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
	}
}
