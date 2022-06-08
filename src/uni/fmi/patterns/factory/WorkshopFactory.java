package uni.fmi.patterns.factory;

public abstract class WorkshopFactory {
	
	public abstract Toy createToy(String toyType);
	
	public Toy produceToy(String toyType) {
		Toy toy = createToy(toyType);
		toy.prepare();
		return toy;
	}

}
