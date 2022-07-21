package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>(5);
		ArrayList<Integer> numbers = new ArrayList<>(5);
		ArrayList<String> result = new ArrayList<>(5);
		
		Collections.addAll(name, "Vasya", "Dima", "Andrey", "Tom", "Eve");
		
		for (int i = 0; i < name.size(); i++) {
			numbers.add(i);
			result.add(numbers.get(i) + " - " + name.get(i));
		}
		result.forEach(System.out::println);
	}

}
