package com.poonia.linkedlist;


public class LinkedList {
	
	public Node head;
	LinkedList(){
		head =null;
	}
	
	public void addAtFirst(int data){
		if(head == null){
			head = new Node(data);
		}else{
			Node temp = new Node(data);
			temp.next= head;
			head = temp;
		}
	}
	public void addAtLast(int data){
		if(head == null){
			head = new Node(data);
		}else{
			Node temp = head;
			while(temp.next!= null){
				temp=temp.next;
			}
			temp.next = new Node(data);
		}
	}
	public void addAtPosition(int data,int pos){
		if (head ==null){
			if(pos>1){
				System.out.println("the given position doesn't exist");
			}else if (pos==1){
				head = new Node(data);
			}
		}else{
			int count =1 ;
			Node curr = head;
			Node prev = null;
			while(curr!=null && count < pos){
				prev=curr;
				curr=curr.next;
				count++;
			}
			if(count == pos){
				Node temp = new Node(data);
				temp.next=curr;
				prev.next= temp;
			}
		}
	}
	public void reverseList(){
		if( head==null){
			return;
		}else{
			Node next;
			Node prev=null;
			Node curr=head;
			
			while(curr!=null){
				next = curr.next;
				curr.next= prev;
				prev=curr;
				curr=next;
			}
			head=prev;
		}
	}
	public void middleElement(){
		if(head == null){
			return;			
		}else{
			Node temp1x,temp2x;
			temp1x=temp2x=head;
			while(temp2x.next!=null){
				if(temp1x.next!=null)
				   temp1x = temp1x.next;
				
				if(temp2x.next!=null){
					temp2x=temp2x.next;
				}
				if(temp2x.next!=null){
					temp2x= temp2x.next;
				}
			}
			System.out.println("\nthe middle element is: "+temp1x.data);
		}
	}
	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.addAtFirst(1);
		list.addAtFirst(2);
		list.addAtFirst(3);
		list.addAtFirst(4);
//		list.printList();
		list.addAtLast(5);
		list.addAtLast(6);
		list.printList();
		list.reverseList();
		list.addAtFirst(11);
		list.addAtFirst(12);
		list.addAtFirst(14);
		list.addAtFirst(17);
		System.out.println("\nnew reveresed list");
		list.printList();
		list.addAtPosition(13, 2);
		System.out.println("\nnew list after adding element at possition");
		list.printList();
		list.middleElement();
		
	}
	

}
