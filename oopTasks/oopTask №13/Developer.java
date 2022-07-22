package interfaces;

public class Developer implements Worker, Drive {

	@Override
	public void drive() {
		System.out.println("Разработчик умеет водить машину");
		
	}

	@Override
	public void work() {
		System.out.println("Разработчик разрабатывает");
		
	}

}
