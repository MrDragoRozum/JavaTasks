package oopTask7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(123, 1, 2);
		Box box2 = box.increase();
		
		double valumeBox1 = box.getVolume();
		double valumeBox2 = box2.getVolume();
		
		System.out.println(valumeBox1);
		System.out.println(valumeBox2);
	}

}
