package com.dashik.list;

class PrintList {
	public static void main (String[] arg) {
		
		LinkedList TestList = new LinkedList();
		TestList.add(5);
		TestList.add("a");
		
		Node current = TestList.head; 
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		
		System.out.println(TestList.size());
		System.out.println(TestList.contains("a"));
		TestList.removeElement("a");
		
		current = TestList.head; 
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		
		TestList.add("a");
		
		MyListIter iter = new MyListIter(TestList);
		System.out.println(iter.hasNext());
		while(iter.hasNext()) {
			System.out.println(iter);	
			iter.next();
		}
		System.out.println(iter);	
		
	}
}