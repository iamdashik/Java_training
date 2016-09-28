package com.dashik.deanery;

abstract class DepartmentRoom {
	public int floor;
	
	public DepartmentRoom(int floor) {
		this.floor=floor;
	}
	
	abstract void open();
}