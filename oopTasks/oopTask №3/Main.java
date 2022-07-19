package oopTask3;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "Блохастик";
		dog.weight = 5;
		dog.breed = "German Shepherd";
		
		System.out.println(dog.getInformation());
		dog.speed = 5;
		dog.run();
	}
}
