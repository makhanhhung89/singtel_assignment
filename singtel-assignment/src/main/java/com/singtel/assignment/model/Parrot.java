package com.singtel.assignment.model;

public class Parrot extends Bird {

	private MakeSoundable liveNear;
	
	public Parrot(MakeSoundable liveNear) {
		super();
		this.liveNear = liveNear;
	}
	
	public Parrot() {
		super();
	}

	@Override
	public void sing() {
		if (liveNear == null) {
			super.sing();
			return; 
		}
		liveNear.sing();
	}
}
