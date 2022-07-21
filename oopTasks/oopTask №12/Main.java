package oopTask11;

public class Main {

	public static void main(String[] args) {
		Shape shapeT = new Triangle(10, 10, 10);
		Shape shapeR = new Rectangle(10, 20);
		
		System.out.println(shapeR.getPerimeter());
		System.out.println(shapeT.getPerimeter());
		
	}

}
