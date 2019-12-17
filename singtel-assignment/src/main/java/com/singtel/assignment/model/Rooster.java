package com.singtel.assignment.model;

public class Rooster extends Chicken implements MakeSoundable {

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
