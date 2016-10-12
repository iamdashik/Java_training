package com.dashik.deanery;
import java.util.ArrayList;
import java.util.*;

class MainProgram {
	public static void main(String[] arg) {
		
		EducationalRoom[] depRooms = new EducationalRoom[4];
		ArrayList<EducationalRoom> forLecture = new ArrayList<EducationalRoom>();
		
		try {
			depRooms[0] = new DeansOffice("Vasin",1,"14");
			depRooms[1] = new LectureRoom(30,12,"121");
			depRooms[2] = new LectureRoom(30,2,"22");
			depRooms[3] = new LectureRoom(30,2,"21");
			
			for (int i=0; i<4; i++) {
			depRooms[i].open();
			}
		
		
			for (int i=0; i<4; i++) {
							
				/*if(depRooms[i].getClass().getName().equals("com.dashik.deanery.LectureRoom")) {*/
				forLecture.add(depRooms[i]);
				/*}		*/		
			}
			
			
			
			Collections.sort(forLecture, new Comparator<EducationalRoom>() {
				@Override
				public int compare(EducationalRoom room1, EducationalRoom room2)
				{	
					int result = room2.getClass().getName().compareTo(room1.getClass().getName());
					if (result != 0) {
						return (int)(result/Math.abs(result));
					}
					result = room2.roomnumber.compareTo(room1.roomnumber);
					if(result != 0) {
						return (int)(result/Math.abs(result));
					}
					
					return (result != 0) ? (int)(result/Math.abs(result)) : 0;
					
				}
			});
			
			
			/*Collections.sort(forLecture, new Comparator<EducationalRoom>() {
				@Override
				public int compare(EducationalRoom room1, EducationalRoom room2){	
					return room1.roomnumber.compareTo(room2.roomnumber);
				}
			});*/
			
			for (int i=0; i<forLecture.size(); i++) {
				System.out.println(forLecture.get(i).roomnumber);
			}
			
			
			
			/*for (int i=0; i<depRooms.length; i++) {
				for (int j=0; j<forLecture.size(); j++) {
					if((depRooms[i].getClass().getName().equals("com.dashik.deanery.DeansOffice")) 
					&& (depRooms[i].floor==forLecture.get(j).floor) && (depRooms[i].roomnumber==forLecture.get(j).roomnumber)) {
						throw new DuplicateRoomNumberException();
					}
				} 
			}*/		
		}	/*
		catch(DuplicateRoomNumberException e) {
			System.out.println("Duplicated room found");
		}*/	
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			/*return;*/
		}
		catch (NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Program was continued.");
		
		
		
	}
		
		
		
			/*for (int j=0; j<forLecture.size(); j++) {
				
				forLecture.get(j).open();
			}	*/
		
}
