package oopTask10;


public class Box {
	private double lenght;
	private double width;
	private double height;
	
	public Box(double lenght, double width, double height) {
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}
	
	public Box() {
		this(10, 10, 10);
	}
	
	
	public Box(Box box) {
		super();
		this.lenght = box.lenght;
		this.width = box.width;
		this.height = box.height;
	}

	public double getVolume() {
		return this.lenght * this.height * this.width;
	}
	
	public void showInfo() {
		System.out.print("Площадь: " + getVolume());
	}
}
