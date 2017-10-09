package com.poonia.tree;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("\n end of pre order");
		tree.inOrderTraversal(tree.root);
		System.out.println("\n end of pre order");
		tree.postOrderTraversal(tree.root);
		System.out.println("\n end of pre order");
		tree.preOrderTraversal(tree.root);
		System.out.println("\n end of pre order");
		tree.levelOrderTraversal(tree.root);

	}

}
