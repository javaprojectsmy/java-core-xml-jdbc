package com.poonia.problems;

public class LinkedListMy {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println("original Link List");
		list.display();
		System.out.println("reversed Linklist");
		list.reverseLinkList();
		list.display();
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkList {

	Node head;

	LinkList() {
		head = null;
	}

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			head.next = null;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}

	}
   public void reverseLinkList(){
	   Node next;
	   Node prev = null;
	   Node curr =head;
	   
	   while(curr!=null){
		   
		   next = curr.next;
		   curr.next = prev;
		   prev = curr;
		   curr = next;		   
	   }
	   head = prev;
   }
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
