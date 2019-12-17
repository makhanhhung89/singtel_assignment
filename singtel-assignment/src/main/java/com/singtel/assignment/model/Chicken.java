package com.singtel.assignment.model;

public class Chicken extends Bird {

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canSwim() {
		return false;
	}
}
