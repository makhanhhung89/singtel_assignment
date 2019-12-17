package com.singtel.assignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Animal {

	public void walk() {
		if (canWalk())
			System.out.println("I am walking");
	}
	
	@JsonProperty("canSwim")
	public abstract boolean canSwim();
	@JsonProperty("canFly")
	public abstract boolean canFly();
	
	@JsonProperty("canWalk")
	public boolean canWalk() {
		return true;
	}
	
	@JsonProperty("canSing")
	public boolean canSing() {
		return true;
	}
}
