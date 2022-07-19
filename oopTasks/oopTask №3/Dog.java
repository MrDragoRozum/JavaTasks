package oopTask3;

//Добавлен метод run() и поле speed

public class Dog {
	String name;
	double weight;
	String breed;
	int speed;
	
	String getInformation() {
		return "Возраст: " + weight + "\nИмя: " + name + "\nПорода: " + breed;
	}
	
	void run() {
		for(int i = 0; i < speed; i++) {
			System.out.print("Бегу ");
		}
	}
}
