package com.bridgelabz.birdsanctuary;

public class Duck extends Birds implements Flyable,Swimmable {
    static int count;
    
     Duck(String id){
		this.id = id;
    }
	
	@Override
	public String toString() {
		return "Duck [id=" + id +"]";
	}
	
	@Override
	public void eat() {
		System.out.println("Duck is eating");
	}
	
	@Override
	public void fly() {
		System.out.println("Duck is flying");
	}
	
	@Override
	public void swim() {
		System.out.println("Duck is Swimming");
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
