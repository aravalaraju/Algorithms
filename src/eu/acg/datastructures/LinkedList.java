//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Linked List implementation
//******************************************************************************
package eu.acg.datastructures;

// A node in the Linked List
class Node
{
	private int val; // The value of the node
	private Node nextNode; // Reference to the next node
	
	public Node(int value)
	{
		val = value;
		nextNode = null;
	}
	
	public Node getNextNode()
	{
		return nextNode;
	}
	
	public void setNextNode(Node next)
	{
		nextNode = next;
	}
	
	public int getValue()
	{
		return val;
	}
}

public class LinkedList 
{
	// We only need to maintain a reference to the first node in the list
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}

	/**
	 * Adds the value at the end of the list
	 * @param value
	 */
	public void addAtEnd(int value)
	{
		if (isEmpty())
		{
			head = new Node(value);
		}
		else
		{
			/* 
			 * Adding at the end involves traversing the list until the next 
			 * node is null.
			 */
			Node next = head;
			while (next.getNextNode() != null)
			{
				next = next.getNextNode();
			}
			Node newNode = new Node(value);
			next.setNextNode(newNode);
		}
	}

	/**
	 * Adds the value at the front of the list
	 * @param value
	 */
	public void addAtFront(int value)
	{
		if (isEmpty())
		{
			head = new Node(value);
		}
		else
		{
			/*
			 * To add at the front of the list, just make the current head the
			 * successor of the new node:
			 */
			Node newNode = new Node(value);
			newNode.setNextNode(head);
			// And update the head then:
			this.head = newNode;
		}
	}

	/**
	 * Deletes the last element in the list
	 */
	public void deleteAtEnd()
	{
		if (isEmpty())
			System.out.println("Cannot delete -- list empty!");
		else
			if (head.getNextNode() == null)
			{
				head = null;
			}
			else
			{
				/*
				 * To delete from the end of the list, we need to maintain a
				 * reference to the current node and its next node. When the 
				 * next node's successor is null, we eliminate it, and the 
				 * current node becomes the last one.
				 */
				Node beforeNext = head;
				Node next = head.getNextNode();
				while (next.getNextNode() != null)
				{
					next = next.getNextNode();
					beforeNext = beforeNext.getNextNode();
				}
				beforeNext.setNextNode(null);
			}
	}

	/**
	 * Deletes the first element in the list
	 */
	public void deleteAtFront()
	{
		if (isEmpty())
			System.out.println("Cannot delete -- list empty!");
		else
			if (head.getNextNode() == null)
				head = null;
			else
				// To delete at the front, simply advance the head to its next node
				this.head = head.getNextNode();
	}

	/**
	 * Tests whether the list is empty
	 * @return True, if the list is empty
	 */
	public boolean isEmpty()
	{
		// The list is empty when its head is null!
		return (head == null);
	}
	
	/**
	 * Prints the list
	 */
	public void printList()
	{
		if (isEmpty())
			System.out.println("List empty!");
		else
		{
			Node next = head;
			System.out.print("List: ");
			while (next != null)
			{
				System.out.print(next.getValue() + " ");
				next = next.getNextNode();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		System.out.print("Inserting at end! ");
		l.addAtEnd(5);
		l.printList();
		System.out.print("Inserting at end! ");
		l.addAtEnd(8);
		l.printList();
		System.out.print("Inserting at end! ");
		l.addAtEnd(6);
		l.printList();
		System.out.print("Deleting at end! ");
		l.deleteAtEnd();
		l.printList();
		System.out.print("Deleting at end! ");
		l.deleteAtEnd();
		l.printList();
		System.out.print("Deleting at end! ");
		l.deleteAtEnd();
		l.printList();
		System.out.print("Deleting at end! ");
		l.deleteAtEnd();
		l.printList();
		System.out.print("Inserting at front! ");
		l.addAtFront(5);
		l.printList();
		System.out.print("Inserting at front! ");
		l.addAtFront(12);
		l.printList();
		System.out.print("Inserting at end! ");
		l.addAtEnd(6);
		l.printList();
		System.out.print("Deleting at front! ");
		l.deleteAtFront();
		l.printList();
	}
}
