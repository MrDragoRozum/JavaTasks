package oopTask10;

public class WeightBox extends Box {

	private double weight = 0;

	public WeightBox(double lenght, double width, double height, double weight) {
		super(lenght, width, height);
		this.weight = weight;
	}

	public WeightBox() {
		super();
		this.weight = 10;
	}

	public WeightBox(Box box, double weight) {
		super(box);
		this.weight = weight;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("\nВес " + this.weight + " кг");
	}


}
