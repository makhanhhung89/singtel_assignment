package com.singtel.assignment.model;

import java.lang.reflect.Constructor;

public enum SupportedAnimal {

	BIRD(Bird.class),
	BUFFTERFLY(Butterfly.class),
	CAT(Cat.class),
	CHICKEN(Chicken.class),
	CLOWNFISH(Clownfish.class),
	DOG(Dog.class),
	DOLPHIN(Dolphin.class),
	DUCK(Duck.class), 
	FISH(Fish.class), 
	FROG(Frog.class), 
	PARROT(Parrot.class), 
	ROOSTER(Rooster.class), 
	SHARK(Shark.class);

	private Class<? extends Animal> modelClass;

	private SupportedAnimal(Class<? extends Animal> modelClass) {
		this.modelClass = modelClass;
	}

	public Animal createSpecificResource() {
		try {
			Constructor<?> constructor = modelClass.getConstructor();
			return (Animal) constructor.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
