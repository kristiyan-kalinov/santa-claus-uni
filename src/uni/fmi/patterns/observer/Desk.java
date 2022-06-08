package uni.fmi.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Desk implements Observable {
	
	private List<Observer> observers;
	private String message;
	
	public Desk() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
		observer.setDesk(this);
	}
	
	@Override
	public void unregister(Observer observer) {
		this.observers.remove(observer);
		observer.setDesk(null);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
	@Override
	public String getUpdate() {
		return this.message;
	}
	
	public void setMessage(String message) {
		if(message == "doll" || message == "bike") {
			this.message = message;
			System.out.println("Santa Claus says: I need " + this.message + "s");
		}
		else {
			this.message = "Invalid command";
		}
		this.notifyObservers();
	}

}
