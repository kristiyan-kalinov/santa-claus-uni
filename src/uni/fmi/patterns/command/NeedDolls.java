package uni.fmi.patterns.command;

import uni.fmi.patterns.observer.Desk;

public class NeedDolls implements Command {
	
	private Desk desk;

	public NeedDolls(Desk desk) {
		this.desk = desk;
	}
	
	@Override
	public void execute() {
		this.desk.setMessage("doll");
	}
	
	

}
