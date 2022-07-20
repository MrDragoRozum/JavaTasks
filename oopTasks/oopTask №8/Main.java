package oopFromVideos;

public class Main {
	
	public static void main(String[] args) {
		Box box1 = new Box(20, 10, 30);
		double volume = box1.getVolume();
		System.out.println(volume);
		
		Box box2 = new Box();
		double volume2 = box2.getVolume();
		System.out.println(volume2);
		
		Box box3 = new Box(123, 423, 12);
		int i = box3.compareTo(box1);
		System.out.println(i);
		
		Box copy = box3.copy();
		double volume3 = copy.getVolume();
		System.out.println(volume3);
		
		
		double volume4 = copy.getVolume();
		System.out.println(volume4);
	}
}
