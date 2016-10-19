import java.util.*;

class WhatSpeed {
	public static void main(String [] arg) {
		
		long start = System.currentTimeMillis();



		ArrayList<String> arrPeaple = new ArrayList<String>();
		
		for (int i = 0; i < 100; i++) {
			arrPeaple.add("Person" + i);
		} 
		
		System.out.println(arrPeaple.get(98));
				
		
		
		int j = 0;	
		while (arrPeaple.size() != 1) {
			while ( j < arrPeaple.size()) {
				if (j == arrPeaple.size() - 1) {
					arrPeaple.remove(0);
					j=1;
					break;
				}
				else if (j == arrPeaple.size() - 2) {
					arrPeaple.remove(j+1);
					j = 0;
					break;
				}
				else {
					arrPeaple.remove(j+1);
					j++;
				}
			}
		}
		System.out.println(arrPeaple.size());
		
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		System.out.println(timeConsumedMillis);
		
	}
}