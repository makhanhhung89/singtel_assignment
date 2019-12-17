package com.singtel.assignment;

import java.util.Arrays;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.model.Butterfly;
import com.singtel.assignment.model.Butterfly.LifeStage;
import com.singtel.assignment.model.Cat;
import com.singtel.assignment.model.Chicken;
import com.singtel.assignment.model.Clownfish;
import com.singtel.assignment.model.Dog;
import com.singtel.assignment.model.Dolphin;
import com.singtel.assignment.model.Duck;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Fish.Size;
import com.singtel.assignment.model.Frog;
import com.singtel.assignment.model.Parrot;
import com.singtel.assignment.model.Rooster;
import com.singtel.assignment.model.Shark;

public class CountingAnimal {
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[]{
				 new Bird(),
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(new Dog()),
				 new Fish(Size.SMALL, "green"),
				 new Shark(),
				 new Clownfish(),
				 new Dolphin(),
				 new Frog(),
				 new Dog(),
				 new Butterfly(LifeStage.ADULT_BUTTERFLY),
				 new Cat()
				};
		
		System.out.println(Arrays.stream(animals).filter(a -> a.canFly()).count() + " animals can fly");
		System.out.println(Arrays.stream(animals).filter(a -> a.canSing()).count() + " animals can sing");
		System.out.println(Arrays.stream(animals).filter(a -> a.canSwim()).count() + " animals can swim");
		System.out.println(Arrays.stream(animals).filter(a -> a.canWalk()).count() + " animal scan walk");
	}
}
