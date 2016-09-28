package com.dashik.deanery;
import java.util.ArrayList;

class MainProgram {
	public static void main(String[] arg) {
		
		EducationalRoom[] depRooms = new EducationalRoom[4];
		ArrayList<EducationalRoom> forLecture = new ArrayList<EducationalRoom>();
		
		try {
			depRooms[0] = new DeansOffice("Vasin",1,1);
			depRooms[1] = new LectureRoom(30,12,131);
			depRooms[2] = new LectureRoom(30,2,2);
			depRooms[3] = new LectureRoom(30,3,3);
			
			for (int i=0; i<4; i++) {
			depRooms[i].open();
			}
		
		
			for (int i=0; i<4; i++) {
							
				if(depRooms[i].getClass().getName().equals("com.dashik.deanery.LectureRoom")) {
				forLecture.add(depRooms[i]);
				}				
			}
			
			
			
			for (int i=0; i<depRooms.length; i++) {
				for (int j=0; j<forLecture.size(); j++) {
					if((depRooms[i].getClass().getName().equals("com.dashik.deanery.DeansOffice")) 
					&& (depRooms[i].floor==forLecture.get(j).floor) && (depRooms[i].roomnumber==forLecture.get(j).roomnumber)) {
						throw new DuplicateRoomNumberException();
					}
				} 
			}		
		}	
		catch(DuplicateRoomNumberException e) {
			System.out.println("Duplicated room found");
		}	
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
