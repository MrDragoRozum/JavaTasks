package oopTask8;

public class Main {

	public static void main(String[] args) {
		
		MyArrayList array = new MyArrayList();
		
		array.add("Вася");
		array.add("Димка");
		array.add("Том");
		
		for (int i = 0; i < array.getSize(); i++) {
			System.out.println(array.get(i));
		}
		
		array.remove(0);
		array.remove("Том");
		
		System.out.println("\n\"Вася и Том ушли с работы\"\n");
		
		for (int i = 0; i < array.getSize(); i++) {
			System.out.println(array.get(i));
		}

	}

}
