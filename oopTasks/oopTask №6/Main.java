package oopTask6;

public class Main {

	public static void main(String[] args) {
		Monster monster = new Monster();
		Monster monster2 = new Monster(10);
		Monster monster3 = new Monster(5, 3, 6);
		
		monster.voice();
		System.out.println();
		monster2.voice(5);
		System.out.println();
		monster.voice(12, "Аааааа...");
		System.out.println();
		
		monster.showInfo();
		System.out.println();
		monster2.showInfo();
		System.out.println();
		monster3.showInfo();
		
	}
}
