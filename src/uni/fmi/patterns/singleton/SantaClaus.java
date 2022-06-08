package uni.fmi.patterns.singleton;

import uni.fmi.patterns.command.Command;

public class SantaClaus {
	
	private static SantaClaus instance;
	
	private SantaClaus() {}
	
	public static SantaClaus getInstance() {
		
		if(instance == null) {
			instance = new SantaClaus();
		}
		
		return instance;
		
	}
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void say() {
		if(this.command == null) {
			return;
		}
		this.command.execute();
	}
	
}
