package uni.fmi.patterns.factory;

import java.util.Random;

public class ToyFactory extends WorkshopFactory {

	@Override
	public Toy createToy(String toyType) {
		if(toyType == "doll" || toyType == "Doll") {
			return new Doll();
		}
		if(toyType == "bike" || toyType == "Bike") {
			return new Bike();
		}
		else {
			System.out.println("Unknown toy type");
			//producing a random toy to avoid exception
			Random rand = new Random();
			int random = rand.nextInt(2);
			if(random == 0) {
				return new Doll();
			}
			return new Bike();
		}
	}
	
}
