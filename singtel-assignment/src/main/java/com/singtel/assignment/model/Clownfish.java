package com.singtel.assignment.model;

public class Clownfish extends Fish{

	public Clownfish() {
		super(Size.SMALL, "colorful");
	}

	@Override
	public void action() {
		System.out.println("Make jokes");
	}
}
