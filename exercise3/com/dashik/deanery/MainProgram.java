package com.dashik.deanery;
import java.util.ArrayList;

class MainProgram {
	public static void main(String[] arg) {
		
		DepartmentRoom[] depRooms = new DepartmentRoom[4];
		ArrayList<DepartmentRoom> forLecture = new ArrayList<DepartmentRoom>();
		depRooms[0] = new DeansOffice("Vasin",1,1);
		depRooms[1] = new LectureRoom(30,1,1);
		depRooms[2] = new LectureRoom(30,1,2);
		depRooms[3] = new LectureRoom(30,1,3);
		
		
		
		
		for (int i=0; i<4; i++) {
			depRooms[i].open();
		}
		
		
		for (int i=0; i<4; i++) {
							
			if(depRooms[i].getClass().getName().equals("com.dashik.deanery.LectureRoom")) {
				forLecture.add(depRooms[i]);
				
			}
			/*for (int j=0; j<forLecture.size(); j++) {
				
				forLecture.get(j).open();
			}	*/
		}
	}
}