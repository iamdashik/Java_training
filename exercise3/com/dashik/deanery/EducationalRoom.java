package com.dashik.deanery;

public abstract class EducationalRoom extends DepartmentRoom {
	int roomnumber;
	
	public EducationalRoom(int floor, int roomnumber) {
		super(floor);
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