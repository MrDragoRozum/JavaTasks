package interfaces;

public class Cook implements Drive, Worker {

	@Override
	public void work() {
		System.out.println("Повар готовит");
		
	}

	@Override
	public void drive() {
		System.out.println("Повар умеет водить машину");
		
	}

}
