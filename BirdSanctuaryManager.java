package com.bridgelabz.birdsanctuary;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {


    Set<Birds> birdList = new HashSet<Birds>();
   
	public void add(Birds bird) throws BirdSanctuaryException {
		if (bird == null) {
			throw new BirdSanctuaryException();
		} else if (birdList.add(bird)) {
			bird.incrementCount();	
			bird.totalCount++;
		}
	}
	
	public void remove(Birds bird) {
		if (birdList.remove(bird)) {
			bird.decrementCount();	
		}
	}

	public void print() {
		for(Birds list: birdList) {
			System.out.println(list);
	    }
	}
	
	public void printFlyable() {
	    for(Birds bird: birdList) {
	    	if (bird instanceof Flyable) {
	    		((Flyable) bird).fly();
	    	}
	    }
	}
	
	public void printSwimmable() {
		for(Birds bird: birdList) {
			if (bird instanceof Swimmable) {
			//((Swimmable) bird).swim();
				Swimmable s = (Swimmable)bird;
				s.swim();
			}
		}
	}
	
	public void printEatable() {
		for(Birds bird: birdList) {
			  bird.eat();
		}
	}		
}
