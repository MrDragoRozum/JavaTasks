package oopTasks;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.age = 30;
		person1.name = "Вася";
		person1.weight = 57;
		
		person2.age = 17;
		person2.name = "Дима";
		person2.weight = 65;
		
		person3.age = 48;
		person3.name = "Джон";
		person3.weight = 63;
		
		double medium = (person1.age + person2.age + person3.age) / 3;
		
		System.out.println(medium);
	}

}
