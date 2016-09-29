package com.dashik.deanery;

public class LectureRoom extends EducationalRoom {
	int numberSeats;
	
	public LectureRoom(int numberSeats, int floor, String number) {
		super(floor,number);
		this.numberSeats=numberSeats;
	} 
	
	public void open() {
		System.out.println("Lecture room is opening!");
	}
	
}