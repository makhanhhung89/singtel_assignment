package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends AbstractTest {
	
	@Test
	public void testDogSays_ReturnCorrectly() {
		Dog dog = new Dog();
		dog.sing();
		Assert.assertThat("dog says ", systemOutRule.getLog(), Matchers.is("Woof, woof\n"));
	}
	
	@Test
	public void testDogCanSwim_ReturnTrue() {
		Dog dog = new Dog();
		Assert.assertThat("dog can swim? ", dog.canSwim(), Matchers.is(true));
	}
	
	@Test
	public void testDogCanFly_ReturnFalse() {
		Dog dog = new Dog();
		Assert.assertThat("dog can Fly? ", dog.canFly(), Matchers.is(false));
	}
	
	@Test
	public void testDogCanSing_ReturnTrue() {
		Dog dog = new Dog();
		Assert.assertThat("dog can sing? ", dog.canSing(), Matchers.is(true));
	}
	
	@Test
	public void testDogCanWalk_ReturnTrue() {
		Dog dog = new Dog();
		Assert.assertThat("dog can walk? ", dog.canWalk(), Matchers.is(true));
	}
	
	@Test
	public void testDogWalk_ReturnIamwalking() {
		Dog dog = new Dog();
		dog.walk();
		Assert.assertThat("Dog walk correcly", systemOutRule.getLog(), Matchers.is("I am walking\n"));
	}
}
