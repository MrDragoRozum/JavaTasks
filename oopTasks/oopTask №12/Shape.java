package oopTask11;

public abstract class Shape {
	
	private int a, b;

	 public Shape(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int getPerimeter();

	public final int getA() {
		return a;
	}
	
	public final int getB() {
		return b;
	}
	
	public final void showPerimeter() {
		System.out.println(getPerimeter());
	}
}
