package uni.fmi;

import java.util.Random;

import uni.fmi.patterns.command.Command;
import uni.fmi.patterns.command.NeedBikes;
import uni.fmi.patterns.command.NeedDolls;
import uni.fmi.patterns.observer.Desk;
import uni.fmi.patterns.observer.Dwarf;
import uni.fmi.patterns.observer.Observer;
import uni.fmi.patterns.singleton.SantaClaus;

public class Main {

	public static void main(String[] args) {
		
		SantaClaus santaClaus = SantaClaus.getInstance();
		
		Desk magicDesk = new Desk();
		Observer dwarf1 = new Dwarf("dwarf1");
		Observer dwarf2 = new Dwarf("dwarf2");
		Observer dwarf3 = new Dwarf("dwarf3");
		
		magicDesk.register(dwarf1);
		magicDesk.register(dwarf2);
		magicDesk.register(dwarf3);
		
		Command needDolls = new NeedDolls(magicDesk);
		Command needBikes = new NeedBikes(magicDesk);
		
		//Test case 1
		/*
		santaClaus.setCommand(needDolls);
		santaClaus.say();
		*/
		
		//Test case 2
		/*
		santaClaus.setCommand(needBikes);
		santaClaus.say();
		*/
		
		//Test case 3
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			int random = rand.nextInt(2);
			if(random == 0) {
				santaClaus.setCommand(needDolls);
				santaClaus.say();
				System.out.println("--------------------------------");
			}
			else {
				santaClaus.setCommand(needBikes);
				santaClaus.say();
				System.out.println("--------------------------------");
			}
		}
		
	}

}
