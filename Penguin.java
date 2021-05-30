package com.bridgelabz.birdsanctuary;

public class Penguin extends Birds implements Swimmable {
    static int count;
    
    Penguin(String id){
		this.id = id;
    }
	
	@Override
	public String toString() {
		return "Penguin [id=" + id +"]";
	}
	
	@Override
	public void eat() {
		System.out.println("Penguin is eating");
	}
	
	@Override
	public void swim() {
		System.out.println("Penguin is swimming");
	}
	
	@Override
	public void incrementCount() {
		count++;
	}
	
	@Override
	public void decrementCount() {
		count--;
	}
}
