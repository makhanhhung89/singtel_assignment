package com.singtel.assignment.model;

public class Frog extends Animal implements MakeSoundable {


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
		return true;
	}

	@Override
	public boolean canSing() {
		return true;
	}

	@Override
	public void sing() {
		System.out.println("croak croak");
	}
}
