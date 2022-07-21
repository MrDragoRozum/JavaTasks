package oopTask9;

public class Person {

	private int age;
	private String name;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	String getInfo() {
		return "Имя: " + name + "\nВозравст: " + age;
	}

}
