package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest extends AbstractTest {
	
	
	@Test
	public void testBirdSing_ReturnIamsinging() {
		Bird bird = new Bird();
		bird.sing();
		Assert.assertThat("Bird sing correcly", systemOutRule.getLog(), Matchers.is("I am singing\n"));
	}
	
	@Test
	public void testBirdFly_ReturnIamflying() {
		Bird bird = new Bird();
		bird.fly();
		Assert.assertThat("Bird fly correcly", systemOutRule.getLog(), Matchers.is("I am flying\n"));
	}
	
	@Test
	public void testBirdWalk_ReturnIamwalking() {
		Bird bird = new Bird();
		bird.walk();
		Assert.assertThat("Bird walk correcly", systemOutRule.getLog(), Matchers.is("I am walking\n"));
	}
	
	@Test
	public void testBirdCanSwim_ReturnFalse() {
		Bird bird = new Bird();
		Assert.assertThat("bird can swim? ", bird.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testBirdCanFly_ReturnTrue() {
		Bird bird = new Bird();
		Assert.assertThat("bird can Fly? ", bird.canFly(), Matchers.is(true));
	}
	
	@Test
	public void testBirdCanSing_ReturnTrue() {
		Bird bird = new Bird();
		Assert.assertThat("bird can sing? ", bird.canSing(), Matchers.is(true));
	}
	
	@Test
	public void testBirdCanWalk_ReturnTrue() {
		Bird bird = new Bird();
		Assert.assertThat("bird can walk? ", bird.canWalk(), Matchers.is(true));
	}
}
