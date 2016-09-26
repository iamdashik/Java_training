package com.dashik.deanery;

public class DeansOffice extends EducationalRoom implements TimetableRoom {
	String deansName;
	TimetableRoom ttroom;
	public static int hourbegin=8;
	public static int hourend=16;
	
	public DeansOffice(String deansName, int floor, int number) {
		super(floor, number);
		this.deansName = deansName;
		ttroom = new TimetableRoomImpl(hourbegin,hourend);
	}
	
	public int getWorkdaySize() {
		return ttroom.getWorkdaySize();
	}
	
	public void open() {
		System.out.println("Dean's office is opening!");
	}
}