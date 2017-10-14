package com.poonia.tree;

public class PostOrderFromInOrder_PreOrder {
	public int preindex;

	public Node constructTreeUtil(int pre[], int post[], int l, int h, int size) {

		if (preindex >= size || l > h)
			return null;

		Node root = new Node(pre[preindex]);
		preindex++;

		if (l == h || preindex >= size)
			return root;
		int i;

		for (i = l; i <= h; i++) {
			if (post[i] == pre[preindex])
				break;
		}
		if (i <= h) {
			root.left = constructTreeUtil(pre, post, l, i, size);
			root.right = constructTreeUtil(pre, post, i + 1, h, size);
		}
		return root;
	}

	public Node constructTree(int pre[], int post[], int size) {
		preindex = 0;
		return constructTreeUtil(pre, post, 0, size - 1, size);
	}

	static void printInorder(Node root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}

	public static void main(String[] args) {

		int pre[] = { 1, 2, 4, 8, 9, 5, 3, 6, 7 };
		int post[] = { 8, 9, 4, 5, 2, 6, 7, 3, 1 };
		PostOrderFromInOrder_PreOrder postOrder = new PostOrderFromInOrder_PreOrder();
		int size = pre.length;
		Node root = postOrder.constructTree(pre, post, size);

		System.out.println("Inorder traversal of the constructed tree:");
		printInorder(root);
	}
}
