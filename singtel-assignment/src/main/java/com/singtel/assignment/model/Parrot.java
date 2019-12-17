package com.singtel.assignment.model;

public class Parrot extends Bird {

	/**
	 * if liveNear is null, it means the parrot live with nothing
	 */
	private final MakeSoundable liveNear;
	
	public Parrot(MakeSoundable liveNear) {
		super();
		this.liveNear = liveNear;
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
