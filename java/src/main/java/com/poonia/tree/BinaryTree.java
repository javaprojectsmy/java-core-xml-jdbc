package com.poonia.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class BinaryTree {
	public Node root;
	ArrayList<Integer> list = new ArrayList<Integer>();

	BinaryTree() {
		root = null;
	}

	public void inOrderTraversal(Node root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(" " + root.data);
		inOrderTraversal(root.right);

	}

	public void preOrderTraversal(Node root) {
		if (root == null)
			return;
		System.out.print(" " + root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void postOrderTraversal(Node root) {
		if (root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(" " + root.data);
	}

	public void levelOrderTraversal(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> s = new LinkedList<Node>();
		s.add(root);
		while (!s.isEmpty()) {
			Node temp = s.remove();
			System.out.print(" " + temp.data);
			if (temp.left != null) {
				s.add(temp.left);
			}
			if (temp.right != null) {
				s.add(temp.right);
			}
			// System.out.println();
		}
	}

	public void inOrderIterative(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node node = root;

		while (node != null) {
			s.push(node);
			node = node.left;
		}
		while (!s.empty()) {
			node = s.pop();
			System.out.print(" " + node.data);
			if (node.right != null) {
				node = node.right;

				while (node != null) {
					s.push(node);
					node = node.left;
				}
			}

		}
	}

	public void preOrderIterative(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while (!s.isEmpty()) {
			Node temp = s.pop();
			System.out.print(" " + temp.data);

			if (temp.right != null) {
				s.push(temp.right);
			}
			if (temp.left != null) {
				s.push(temp.left);
			}
		}
	}

	public void reverseLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		Stack<Integer> s = new Stack<Integer>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			s.push(temp.data);
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		while (!s.isEmpty()) {
			System.out.print(" " + s.pop());
		}
	}

	public ArrayList<Integer> postOrderIterative(Node node) {
		Stack<Node> S = new Stack<Node>();

		if (node == null)
			return list;
		S.push(node);
		Node prev = null;
		while (!S.isEmpty()) {
			Node current = S.peek();

			/*
			 * go down the tree in search of a leaf an if so process it and pop
			 * stack otherwise move down
			 */
			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null)
					S.push(current.left);
				else if (current.right != null)
					S.push(current.right);
				else {
					S.pop();
					list.add(current.data);
				}

				/*
				 * go up the tree from left node, if the child is right push it
				 * onto stack otherwise process parent and pop stack
				 */
			} else if (current.left == prev) {
				if (current.right != null)
					S.push(current.right);
				else {
					S.pop();
					list.add(current.data);
				}

				/*
				 * go up the tree from right node and after coming back from
				 * right node process parent and pop stack
				 */
			} else if (current.right == prev) {
				S.pop();
				list.add(current.data);
			}

			prev = current;
		}

		return list;
	}

	public void diagonalPrintUtil(Node root, int d, HashMap<Integer, Vector<Integer>> diagonalPrint) {

		if (root == null)
			return;

		// get the list at the particular d value
		Vector<Integer> k = diagonalPrint.get(d);

		// k is null then create a vector and store the data
		if (k == null) {
			k = new Vector<>();
			k.add(root.data);
		}

		// k is not null then update the list
		else {
			k.add(root.data);
		}

		// Store all nodes of same line together as a vector
		diagonalPrint.put(d, k);

		// Increase the vertical distance if left child
		diagonalPrintUtil(root.left, d + 1, diagonalPrint);

		// Vertical distance remains same for right child
		diagonalPrintUtil(root.right, d, diagonalPrint);
	}

	// Print diagonal traversal of given binary tree
	public void diagonalPrint(Node root) {
		// create a map of vectors to store Diagonal elements
		HashMap<Integer, Vector<Integer>> diagonalPrint = new HashMap<>();
		diagonalPrintUtil(root, 0, diagonalPrint);

		System.out.println("Diagonal Traversal of Binnary Tree");
		for (Entry<Integer, Vector<Integer>> entry : diagonalPrint.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public int isSumProperty(Node root) {
		int left_data = 0, right_data = 0;

		if (root == null || (root.left == null && root.right == null)) {
			return 1;
		} else {
			if (root.left != null) {
				left_data = root.left.data;
			}
			if (root.right != null) {
				right_data = root.right.data;
			}
			if ((root.data == (left_data + right_data) && (isSumProperty(root.left) != 0)
					&& (isSumProperty(root.right) != 0))) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public int sizeOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			return (sizeOfTree(root.left) + 1 + sizeOfTree(root.right));
		}
	}

	public int HeightOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			return (1 + Math.max(HeightOfTree(root.left), HeightOfTree(root.right)));
		}
	}

	public int HeightOfTreeIterative(Node root) {
		if (root == null) {
			return 0;
		} else {
			int count = 0;
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			q.add(null);
			while (!q.isEmpty()) {
				Node temp = q.remove();

				if (temp == null) {
					count++;
					if (q.peek() != null) {
						q.add(null);
					}
				} else {
					if (temp.left != null) {
						q.add(temp.left);
					}
					if (temp.right != null) {
						q.add(temp.right);
					}
				}
			}
			return count;
		}
	}
	public int diameterOfTree(Node root){
		if(root==null){
			return 0;
		}
		int lheight= HeightOfTree(root.left);
		int rheight = HeightOfTree(root.right);
		int lDiameter = diameterOfTree(root.left);
		int rDiameter = diameterOfTree(root.right);
		return Math.max(lheight +rheight +1, Math.max(lDiameter, rDiameter));
	}
}
