package interfaces2;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		WinterDima worker = new WinterDima();
		client.makeOrder(worker, "Сосика в тесте");
		
		client.makeOrder(new Winter() {
			
			@Override
			public String bringOrder(String dish) {
				return "\nОфициант принес блюдо " + dish;
			}
		}, "Гречка");
		
		client.makeOrder((n) -> "\nОфициант принес блюдо " + n, "Капуста");
	
	}

}
