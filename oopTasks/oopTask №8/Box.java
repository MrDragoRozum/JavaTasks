package oopFromVideos;

// Тут мы используем модификаторы доступа

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
	
	public double getVolume() {
		return this.lenght * this.height * this.width;
	}
	
	
	public int compareTo(Box another) {
		double currentVolume = getVolume();
		double anotherVolume = another.getVolume();
		
		if(currentVolume > anotherVolume) {
			return 1;
		} else if (currentVolume < anotherVolume) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Box copy() {
		return new Box(this.width, this.lenght, this.height);
	}
}
