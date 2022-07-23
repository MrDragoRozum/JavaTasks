package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Worker> workers = new ArrayList<>();
		ArrayList<Drive> drives = new ArrayList<>();
		
		Collections.addAll(workers, new Head(), new Cook(), new Developer());
		Collections.addAll(drives, new Cook(), new Developer());
		
		for (Drive drive : drives) {
			drive.drive();
		}
		
		System.out.println();
		
		for (Worker work : workers) {
			work.work();
		}

	}

}
