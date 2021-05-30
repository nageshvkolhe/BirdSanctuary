package com.bridgelabz.birdsanctuary;

public class Application {
	
	public static void main(String[] args) throws BirdSanctuaryException {
	     System.out.println("Welcome to Bird Sanctuary");
	
	     BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();  
	     
	     Parrot parrot1 = new Parrot("p1");
	     Parrot parrot2 = new Parrot("p1");
	     Parrot parrot3 = new Parrot("p3");
	     
	     Duck duck1 = new Duck("d1");
	     Duck duck2 = new Duck("d1");
	     Duck duck3 = new Duck("d3");
	    
	     Penguin penguin1 = new Penguin("pn1");
	     Penguin penguin2 = new Penguin("pn2"); 
	     Penguin penguin3 = new Penguin("pn3");
	     
	    try {
	     birdSanctuaryManager.add(parrot1);
	    } catch (Exception e1) {
	    	 e1.printStackTrace();
	    }
	    
	    try {
	    	birdSanctuaryManager.add(parrot2);
	    } catch (Exception e) {
	    	 e.printStackTrace();
	    }
	    
	    try {
	    	birdSanctuaryManager.add(parrot3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
	    try {	     
	    	birdSanctuaryManager.add(duck1);
	    } catch (Exception e) {
	    	 e.printStackTrace();
	    }
	     
	     try {
	    	 birdSanctuaryManager.add(duck2);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     try {
	    	 birdSanctuaryManager.add(duck3);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     try {	     
	    	 birdSanctuaryManager.add(penguin1);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     try {
	    	 birdSanctuaryManager.add(penguin2);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     try {
	    	 birdSanctuaryManager.add(penguin3);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }

	     try {
	    	 birdSanctuaryManager.add(null);
	     } catch (Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     birdSanctuaryManager.remove(parrot3);
	     birdSanctuaryManager.remove(duck3);
	     birdSanctuaryManager.remove(penguin3);
	     
	          
	     birdSanctuaryManager.print();
	     
	     
	     birdSanctuaryManager.printEatable();
	     birdSanctuaryManager.printFlyable();
	     birdSanctuaryManager.printSwimmable();
	     
	     System.out.println("Parrot count" +Parrot.count);
	     System.out.println("Duck count" +Duck.count);
	     System.out.println("Penguin count" +Penguin.count);
	     System.out.println("Total Count Of Birds" +Birds.totalCount);
	     
	}
}
