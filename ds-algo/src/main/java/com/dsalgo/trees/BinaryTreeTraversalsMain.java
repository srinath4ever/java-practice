package com.dsalgo.trees;

import java.util.Stack;

/**
 * Simple Binary Tree with below structure:
  
   				40
   		20				60
   	10		30		50		70
   
 * 1. Pre Order traversal
 	Visit the node.
	Traverse the left subtree in PreOrder.
	Traverse the right subtree in PreOrder.
	
	40 20 10 30 60 50 70 
	
 * 2. Post Order traversal
	Traverse the left subtree in PostOrder.
	Traverse the right subtree in PostOrder.
	Visit the node.
	
	10 30 20 50 70 60 40 
	
 * 3. In Order traversal
	Traverse the left subtree in InOrder.
	Visit the node.
	Traverse the right subtree in InOrder.
	
	10 20 30 40 50 60 70 
	
 * @author Srinath.Rayabarapu
 */
public class BinaryTreeTraversalsMain {

	public static void main(String[] args) {

		CustomBinaryTree bTree = new CustomBinaryTree();
		bTree.addNode(10, "one");
		bTree.addNode(20, "two");
		bTree.addNode(30, "three");
		bTree.addNode(40, "four");
		bTree.addNode(50, "five");
		bTree.addNode(60, "six");
		bTree.addNode(70, "seven");

		System.out.println("Original Tree: ");
		bTree.printTree();
		
		System.out.println("\n----- Pre Order -----");
		System.out.println("Recursive approach");
		preOrderRecursive(bTree.root);
		
		System.out.println("\nIterative approach");
		preOrderIterative(bTree.root);
		
		System.out.println("\n\n----- Post Order -----");
		System.out.println("Recursive approach");
		postOrderRecursive(bTree.root);

		System.out.println("\n\n----- In Order -----");
		System.out.println("Recursive approach");
		inOrderRecursive(bTree.root);
	}

	/**
	 * printTree left child, node and right child
	 *
	 * @param tNode
	 */
	private static void inOrderRecursive(TreeNode tNode) {
		if(tNode != null){
			inOrderRecursive(tNode.leftChild);
			print(tNode);
			inOrderRecursive(tNode.rightChild);
		}
	}

	/**
	 * printTree node, left child and right child
	 *
	 * recursive is easy - uses implicit Stack
	 *
	 * @param tNode
	 */
	private static void preOrderRecursive(TreeNode tNode) {
		if(tNode != null){
			print(tNode);
			preOrderRecursive(tNode.leftChild);
			preOrderRecursive(tNode.rightChild);
		}
	}

	/**
	 * printTree left child, right child and node
	 *
	 * @param tNode
	 */
	private static void postOrderRecursive(TreeNode tNode){
		if(tNode != null){
			postOrderRecursive(tNode.leftChild);
			postOrderRecursive(tNode.rightChild);
			print(tNode);
		}
	}

	/**
	 * Need to do manual - uses external Stack
	 *
	 * Create empty stack and push root node to it.
	 * Do the following when stack is not empty
	 * Pop a node from stack and print it
	 * Push right child of popped node to stack
	 * Push left child of popped node to stack
	 *
	 * @param tNode
	 */
	private static void preOrderIterative(TreeNode tNode) {
		
		if(tNode == null)
			return;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(tNode);
		
		while(!stack.empty()){
			TreeNode pop = stack.pop();
			print(pop);
			
			//push right first so that while popping left comes early
			if(pop.rightChild != null)
				stack.push(pop.rightChild);
			if(pop.leftChild != null)
				stack.push(pop.leftChild);
		}
	}

	private static void print(TreeNode tNode) {
		System.out.print(tNode.data +" ");
	}
}