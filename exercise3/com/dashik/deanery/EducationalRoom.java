package com.dashik.deanery;

public abstract class EducationalRoom extends DepartmentRoom {
	public int roomnumber;
	
	public EducationalRoom(int floor, int roomnumber) throws IllegalArgumentException{
		super(floor);
		
		if(new Integer(roomnumber)==null) {
			throw new NullPointerException("The roomnumber can't be null!"); 
		}
		
		if(!(new Integer(roomnumber).toString().startsWith(new Integer(floor).toString()))) {
			throw new IllegalArgumentException("The room number should start from floor number!");		 	
		}
		
		this.roomnumber=roomnumber;
	}
	
	public boolean equals(EducationalRoom educRoom) {
		if (this.roomnumber==educRoom.roomnumber) {
			return true;
		}
		else {
			return false;
		}
	}
}