package com.singtel.assignment.model;

public class Bird extends Animal {
	
	public void fly() {
		if (canFly())
			System.out.println("I am flying");
	}
	
	public void sing() {
		if (canSing())
			System.out.println("I am singing");
	}
	
	@Override
	public boolean canFly() {
		return true;
	}
	
	@Override
	public boolean canSwim() {
		return false;
	}
}
