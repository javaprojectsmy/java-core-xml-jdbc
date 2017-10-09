package com.poonia.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public Node root;
	BinaryTree() {
		root = null;
	}
	public void inOrderTraversal(Node root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(" "+root.data);
		inOrderTraversal(root.right);

	}

	public void preOrderTraversal(Node root) {
		if (root == null)
			return;
		System.out.print(" "+root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void postOrderTraversal(Node root) {
		if (root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(" "+root.data);
	}
	public void levelOrderTraversal(Node root){
		
      Queue<Node> s = new LinkedList<Node>();
      s.add(root);
      while(!s.isEmpty()){
    	  Node temp = s.remove();
    	  System.out.print(" "+temp.data);
    	  if(temp.left != null){
    		  s.add(temp.left);
    	  }
    	  if(temp.right!= null){
    		  s.add(temp.right);
    	  }
      }
	}
}
