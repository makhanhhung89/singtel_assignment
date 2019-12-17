package com.singtel.assignment.model;

public abstract class Animal {

	public void walk() {
		System.out.println("I am walking");
	}
	
	public abstract boolean canSwim();
	public abstract boolean canFly();
	
}
