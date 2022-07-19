package oopTask4;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		rectangle.setWidth(5);
		rectangle.setLength(120);
		
		System.out.println(rectangle.getArea());
		
		rectangle.set(12, 2);
		
		System.out.println(rectangle.getArea());
	
	}
}
