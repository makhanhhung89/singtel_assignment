package com.singtel.assignment.model;

public class Shark extends Fish {

	public Shark() {
		super(Size.LARGE, "Grey");
	}

	@Override
	public void action() {
		System.out.println("Eat other fish");
	}
}
