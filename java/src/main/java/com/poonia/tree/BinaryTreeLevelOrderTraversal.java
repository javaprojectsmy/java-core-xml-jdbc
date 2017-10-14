package com.poonia.tree;

import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTree tree1 = new BinaryTree();
		tree.root = new Node(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);		
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		tree.root.right.right.left = new Node(14);
		tree.root.right.right.right = new Node(15);
		

		System.out.println("\n start of inorder order");
		tree.inOrderTraversal(tree.root);
		System.out.println("\n start of post order");
		tree.postOrderTraversal(tree.root);
		System.out.println("\n start of pre order");
		tree.preOrderTraversal(tree.root);
		System.out.println("\n start of level order");
		tree.levelOrderTraversal(tree.root);
		System.out.println("\n start of in order iterative Order");
		tree.inOrderIterative(tree.root);
		System.out.println("\n start ot preorde iterative");
		tree.preOrderIterative(tree.root);
		System.out.println("\n start of the reverse level order");
		tree.reverseLevelOrder(tree.root);

		ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);

		System.out.println("\nPost order iterative traversal of binary tree is :");
		System.out.println(mylist);
		
		System.out.println("\ncheck if the tree follows the root child sum property");
		tree1.root = new Node(10);
		tree1.root.left = new Node(8);
		tree1.root.right = new Node(2);
		tree1.root.left.left = new Node(3);
		tree1.root.left.right = new Node(5);
		tree1.root.right.right = new Node(2);
		System.out.println(tree.isSumProperty(tree1.root));
		System.out.println("size of tree 1: "+tree1.sizeOfTree(tree1.root));
		System.out.println("size of tree 0: "+tree.sizeOfTree(tree.root));
		System.out.println("height of tree 1 :"+tree1.HeightOfTree(tree1.root));
		System.out.println("height of tree 0 :"+tree.HeightOfTree(tree.root));
		System.out.println("height of tree 1 iterative :"+tree1.HeightOfTreeIterative(tree1.root));
		System.out.println("height of tree 0 iterative :"+tree.HeightOfTreeIterative(tree.root));
		System.out.println("Diameter of the tree 0: "+tree.diameterOfTree(tree.root));
		System.out.println("Diameter of the tree 0: "+tree1.diameterOfTree(tree1.root));
	}

}
