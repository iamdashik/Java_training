package com.dashik.deanery;

public class TimetableRoomImpl implements TimetableRoom {
	int hourBegin;
	int hourEnd;
	
	public TimetableRoomImpl(int hourBegin, int hourEnd) {
		this.hourBegin=hourBegin;
		this.hourEnd=hourEnd;
	}
	public int getWorkdaySize() {
		if(hourEnd-hourBegin>0) {
			return hourEnd-hourBegin;
		}
		else{
			System.out.println("Incorrect hour. End hour should be higher then begin hour");
			return	0;
		}
	}
}