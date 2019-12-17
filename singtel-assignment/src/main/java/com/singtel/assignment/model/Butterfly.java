package com.singtel.assignment.model;

public class Butterfly extends Bird {
	
	public enum LifeStage {
		CATERPILLAR, ADULT_BUTTERFLY
	}
	
	private LifeStage stage = LifeStage.CATERPILLAR;
	
	public Butterfly(LifeStage stage) {
		super();
		this.stage = stage;
	}
	
	public Butterfly() {
		super();
	}

	@Override
	public boolean canSwim() {
		return false;
	}

	@Override
	public boolean canFly() {
		return stage == LifeStage.CATERPILLAR ? false : true;
	}
	
	@Override
	public boolean canWalk() {
		return stage == LifeStage.CATERPILLAR ? true : false;
	}

	@Override
	public boolean canSing() {
		return false;
	}

	public LifeStage getStage() {
		return stage;
	}

	public void setStage(LifeStage stage) {
		this.stage = stage;
	}
}
