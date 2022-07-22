package interfaces2;

public class WinterDima implements Winter {

	@Override
	public String bringOrder(String dish) {
		return "\nОфициант принес блюдо " + dish;
		
	}

}
