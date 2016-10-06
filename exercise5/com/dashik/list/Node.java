package com.dashik.list;

public class Node<T> {
	public T value;
	public Node next;
	
	public Node(T value) {
		this.value = value;
		next=null;
	}
	@Override
	public boolean equals(Object value) {
		if(this.value == value) {
			return true;
		}
		else {
			return false;
		}
	}

}