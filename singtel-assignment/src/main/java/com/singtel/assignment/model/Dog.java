package com.singtel.assignment.model;

public class Dog extends Animal implements MakeSoundable {

	@Override
	public void sing() {
		System.out.println("Woof, woof");
	}

	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public boolean canFly() {
		return false;
	}
	
}
