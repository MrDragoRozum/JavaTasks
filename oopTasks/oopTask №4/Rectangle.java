package oopTask4;

public class Rectangle {

	private double length, width;
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	// или
	
	public void set(double length, double width) {
		setWidth(width);
		setLength(length);
	}
	
	double getArea() {
		return this.length * this.width;
	}
	
}
