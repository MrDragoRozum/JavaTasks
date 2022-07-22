package exception;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		try {
			for (int i = 0; i < array.length + 1; i++) {
				array[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Массив переполнен!");
		}
	}
}
