package com.singtel.assignment.model;

public class Duck extends Bird {

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canSwim() {
		return true;
	}

}
