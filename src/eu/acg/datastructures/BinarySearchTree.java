//******************************************************************************
// Author: Cristina Grama
// Date: 23.04.2013
// Title: Binary Search Tree implementation
//******************************************************************************
package eu.acg.datastructures;

class TreeNode
{
	private int val; // The value of the node
	private TreeNode left; // Reference to the left child of the node
	private TreeNode right; // Reference to the right child of the node 
	
	public TreeNode(int value)
	{
		val = value;
		left = null;
		right = null;
	}	
	
	public int getValue()
	{
		return val;
	}
	
	public TreeNode getLeftChild()
	{
		return left;
	}

	public TreeNode getRightChild()
	{
		return right;
	}

	public void setLeftChild(TreeNode node)
	{
		left = node;
	}

	public void setRightChild(TreeNode node)
	{
		right = node;
	}
}

public class BinarySearchTree 
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}
	
	public void insertValue(int val)
	{
		if (root == null)
			root = new TreeNode(val);
		else
		{
			if (val < root.getValue())
				insertValueHelper(root.getLeftChild(), val);
			else
				if (val > root.getValue())
					insertValueHelper(root.getRightChild(), val);
		}
	}
	
	/**
	 * Inserts the value in the subtree with the root at node
	 * @param node
	 * @param val
	 */
	public void insertValueHelper(TreeNode node, int val)
	{
		if (node == null)
			node = new TreeNode(val);
		else
		if (val < node.getValue())
			insertValueHelper(node.getLeftChild(), val);
		else
			if (val > node.getValue())
				insertValueHelper(node.getRightChild(), val);
	}
	
	/**
	 * Breadth-first traversal of the tree
	 */
	public void printTreeBF()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
