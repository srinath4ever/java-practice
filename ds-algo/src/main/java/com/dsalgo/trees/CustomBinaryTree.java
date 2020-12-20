package com.dsalgo.trees;

/**
 * creates a binary tree when we add nodes to it.
 *
 * @author Srinath.Rayabarapu
 */
public class CustomBinaryTree {

    static TreeNode root;

    public void addNode(int data){
        addNode(data, "");
    }

    /**
     * it simply checks and adds the elements to left or right of current node.
     *
     * @param data
     * @param name
     */
    public void addNode(int data, String name){

        TreeNode newNode = new TreeNode(data, name);
        if(root == null){
            root = newNode;
        }
        else {
            TreeNode focusNode = root;
            TreeNode parent;
            while(true){
                parent = focusNode;
                //if the data is less than focusNode then go to it's left child
                if(data < focusNode.data){
                    focusNode = focusNode.leftChild;
                    //if null then we are at the leaf child - insert new node here
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    //then go to it's right child
                    focusNode = focusNode.rightChild;
                    //if null - insert new node here
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void printTree(){
        printRecursive(root);
    }

    private void printRecursive(TreeNode root){
        if(root == null){
            System.out.println("Tree is empty!");
            return;
        }
        System.out.print(root.data);
        if(root.leftChild != null){
            System.out.print(" -> left child : ");
            printRecursive(root.leftChild);
        }
        if(root.rightChild != null){
            System.out.print (" -> right child : ");
            printRecursive(root.rightChild);
        }
    }

}
