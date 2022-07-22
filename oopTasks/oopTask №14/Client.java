package interfaces2;

public class Client {
	
	public void makeOrder(Winter winter, String dish) {
		System.out.println("Клиент заказал блюдо " + dish + winter.bringOrder(dish));
	}
}
