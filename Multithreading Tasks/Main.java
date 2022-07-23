package multithreading;

import java.util.Random;

public class Main {
	
	private static int bound = 1_000_000_000;
	private static Random random = new Random();
	private static int randomNumber = random.nextInt(bound) - 0;
	private static int findingRandom;
	private static boolean isStop = true;

	public static void main(String[] args) {
		
		Thread finding = new Thread(() -> {
			for (int l = 0; l < bound; l++) {
				findingRandom = random.nextInt(bound) - 0;
				if (findingRandom == randomNumber) {
					System.out.println("Подборщик нашел число: " + findingRandom);
					isStop = false;
					break;
				} else {
					findingRandom = random.nextInt(bound) - 0;
				}
			}
		});
		finding.start();

		Thread timer = new Thread(() -> {
			for (long l = 1; l < bound; l++) {
				if (isStop) {
					System.out.println("Подборщик работает, прошло: " + l + " сек.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
				} else {
					break;
				}
			}
		});

		timer.start();
	}

}
