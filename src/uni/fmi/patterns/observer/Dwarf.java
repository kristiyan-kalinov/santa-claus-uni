package uni.fmi.patterns.observer;

import uni.fmi.patterns.factory.Toy;
import uni.fmi.patterns.factory.ToyFactory;

public class Dwarf implements Observer {
	
	private String name;
	private Observable desk;
	private ToyFactory toyFactory = new ToyFactory();
	
	public Dwarf(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.desk == null) {
			System.out.println("No desk set");
			return;
		}
		String message = this.desk.getUpdate();
		System.out.println(name + " sees message: " + message);
		Toy toy = toyFactory.produceToy(message);
		System.out.println(name + " picks up a " + message);
	}
	
	@Override
	public void setDesk(Observable desk) {
		this.desk = desk;
	}

}
