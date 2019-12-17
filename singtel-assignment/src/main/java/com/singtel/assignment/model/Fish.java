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
	
	public enum Size {
		LARGE, SMALL, MEDIUM;
	}
	
	private Size size = Size.SMALL;
	private String color = "white";
	
	public Fish() {
		super();
	}
	public Fish(Size size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	
	public Size getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public void action() {
		System.out.println("I am doing an action");
	}
}
