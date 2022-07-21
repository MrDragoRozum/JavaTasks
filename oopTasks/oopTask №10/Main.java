package oopTask9;

public class Main {

	public static void main(String[] args) {
		
		String string = "This is Vasya. He is 18 years old.";
		
		String name = string.substring(8, 13);
		int age = Integer.parseInt(string.substring(21, 23));
		
		Person person = new Person(name, age);
		
		System.out.println(person.getInfo());
	}

}
