package com.singtel.assignment.model;

public abstract class Animal {

	public void walk() {
		if (canWalk())
			System.out.println("I am walking");
	}
	
	public abstract boolean canSwim();
	public abstract boolean canFly();
	
	public boolean canWalk() {
		return true;
	}
	
	public boolean canSing() {
		return true;
	}
}
