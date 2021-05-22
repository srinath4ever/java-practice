package com.dsalgo.trees;

/**
 * Tree node for all tree operations
 *
 * @author Srinath.Rayabarapu
 */
public class TreeNode {

	int data;
	String name;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode(int data, String name) {
		this.data = data;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " has data " + this.data;
	}

}
