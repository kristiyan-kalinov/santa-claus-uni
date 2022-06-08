package uni.fmi.patterns.factory;

public class Bike extends Toy {

	@Override
	public void prepare() {
		System.out.println("Producing a bike");
	}

}
