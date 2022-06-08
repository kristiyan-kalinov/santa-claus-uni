package uni.fmi.patterns.command;

import uni.fmi.patterns.observer.Desk;

public class NeedBikes implements Command {
	
	private Desk desk;

	public NeedBikes(Desk desk) {
		this.desk = desk;
	}
	
	@Override
	public void execute() {
		this.desk.setMessage("bike");
	}
	
	
	
}
