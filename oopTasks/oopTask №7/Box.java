package oopTask7;

public class Box {
	
	double lenght;
	double width;
	double height;
	
	public Box(double lenght, double width, double height) {
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}
	

	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	double getVolume() {
		return this.lenght * this.height * this.width;
	}

	Box increase() {
		return new Box(this.lenght*2, this.height*2, this.width*2);
	}
}
