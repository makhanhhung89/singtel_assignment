package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest extends AbstractTest {

	@Test
	public void testParrotSing_LiveNearDog_ReturnDogSound() {
		Dog dog = new Dog();
		Parrot parrot = new Parrot(dog);
		parrot.sing();
		Assert.assertThat("parrot says ", systemOutRule.getLog(), Matchers.is("Woof, woof\n"));
	}
	
	@Test
	public void testParrotSing_LiveNearCat_ReturnParrotSound() {
		Cat cat = new Cat();
		Parrot parrot = new Parrot(cat);
		parrot.sing();
		Assert.assertThat("parrot says ", systemOutRule.getLog(), Matchers.is("Meow\n"));
	}
	
	@Test
	public void testParrotSing_LiveNearRooster_ReturnParrotSound() {
		Rooster rooster = new Rooster();
		Parrot parrot = new Parrot(rooster);
		parrot.sing();
		Assert.assertThat("parrot says ", systemOutRule.getLog(), Matchers.is("Cock-a-doodle-doo\n"));
	}
	
	@Test
	public void testParrotCanSwim_ReturnFalse() {
		Parrot parrot = new Parrot();
		Assert.assertThat("parrot can swim? ", parrot.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testParrotCanFly_ReturnTrue() {
		Parrot parrot = new Parrot();
		Assert.assertThat("parrot can swim? ", parrot.canFly(), Matchers.is(true));
	}
	
}
