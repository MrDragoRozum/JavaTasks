package oopTask6;

public class Monster {
	
	private int eyes;
	private int legs;
	private int arms;
	private String sound;
	
	public Monster(int eyes, int legs, int arms) {
		this.eyes = eyes;
		this.legs = legs;
		this.arms = arms;
		sound = "Grrrrr.....";
	}
	
	public Monster() {
		this(2, 2, 2);
	}
	
	public Monster(int count) {
		this(count, count, count);
	}
	
	void voice() {
		System.out.println(sound);
	}
	
	void voice(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(sound);
		}
	}
	
	void voice(int count, String word) {
		for(int i = 0; i < count; i++) {
			System.out.println(word);
		}
	}
	
	void showInfo() {
		System.out.println("Количество глаз: " + this.eyes
				+ "\nКоличество рук: " + this.arms +
				"\nКоличество ног: " + this.legs);
	}
}
