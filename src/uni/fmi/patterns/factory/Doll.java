package uni.fmi.patterns.factory;

public class Doll extends Toy {

	@Override
	public void prepare() {
		System.out.println("Producing a doll");
	}

}
