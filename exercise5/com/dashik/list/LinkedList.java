package com.dashik.list;

public class LinkedList {
	public Node head;
	public Node tail;
	public int count;
	
	public LinkedList() {
		head = null;
		tail = null;
		count = 0;
	}
	
	public <T> void add(T value) {
		Node node = new Node<T>(value);
		
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		count++;
	}
	
	public <T> void removeElement (T elem) {
		Node previous = null;
		Node current = head;
		
		while (current != null) {
			
			if (current.equals(elem)){
				
				if (previous == null) {
					
					head = head.next;
					if (head == null) {
						tail = null;
					}
					
				}
				else {
					previous.next=current.next;
					if (current.next == null) {
						tail=previous;
					};
				}
				count--;
			}
			
			previous = current;
			current = current.next;
		}
	}
	
	public void clear() {
		head = null;
		tail = null;
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public <T> boolean contains(T elem) {
		Node current = head;
		while(current != null) {
			if (current.equals(elem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	
}