package com.singtel.assignment.rooster.without.inheritance;

import com.singtel.assignment.model.Bird;

public class Chicken extends Bird {
	
	public enum ChickenType {
		ROOSTER("Cock-a-doodle-doo"), HEN("Cuc-tat-cuc-tat"), OTHER("Cluck, cluck");
		
		private String sound;
		
		private ChickenType(String sound) {
			this.sound = sound;
		}
		
		public String getSound() {
			return sound;
		}
	}
	
	private final ChickenType chickenType;
	
	public Chicken(ChickenType chickenType) {
		super();
		this.chickenType = chickenType;
	}

	@Override
	public void sing() {
		System.out.println(chickenType.getSound());
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canSwim() {
		return false;
	}
}
