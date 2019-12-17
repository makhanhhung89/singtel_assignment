package com.singtel.assignment.model;

public class Cat extends Animal implements MakeSoundable {

	@Override
	public void sing() {
		System.out.println("Meow");
	}

	@Override
	public boolean canSwim() {
		return false;
	}

	@Override
	public boolean canFly() {
		return false;
	}
}
