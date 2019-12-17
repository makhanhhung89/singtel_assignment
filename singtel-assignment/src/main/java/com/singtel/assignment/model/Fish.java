package com.singtel.assignment.model;

public class Fish extends Animal {

	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canWalk() {
		return false;
	}

	@Override
	public boolean canSing() {
		return false;
	}
}
