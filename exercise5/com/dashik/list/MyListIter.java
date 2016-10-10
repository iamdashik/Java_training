package com.dashik.list;

class MyListIter {
	private Node iter;
	
	public MyListIter(LinkedList iter) {
		this.iter = iter.head;
	}
	
	public boolean hasNext() {
		return (iter.next != null);
	}
	
	public Node next() {
		iter = iter.next;
		return iter;
	}
	
}