package interfaces;

public class Head implements Worker {

	@Override
	public void work() {
		System.out.println("Начальник руководит");
	}

}
