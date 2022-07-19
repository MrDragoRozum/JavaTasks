package oopTask5;

public class Worker {
	
	String name, post;
	int salary;
	
	public Worker(String name, String post, int salary) {
		this.name = name;
		this.post = post;
		this.salary = salary;
	}
	
	void showInformation() {
		System.out.println("Имя: " + name + "\nПост: " + post + "\nЗарплата: " + salary + " руб.");
	}
}
