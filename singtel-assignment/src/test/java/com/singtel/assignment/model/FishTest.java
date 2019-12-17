package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.singtel.assignment.model.Fish.Size;

public class FishTest extends AbstractTest {

	@Test
	public void testFishCanSwim_ReturnTrue() {
		Fish fish = new Fish(Size.SMALL, "White");
		Assert.assertThat("fish can swim? ", fish.canSwim(), Matchers.is(true));
	}
	
	@Test
	public void testFishCanFly_ReturnFalse() {
		Fish fish = new Fish(Size.SMALL, "White");
		Assert.assertThat("fish can fly? ", fish.canFly(), Matchers.is(false));
	}
	
	@Test
	public void testFishCanSing_ReturnFalse() {
		Fish fish = new Fish(Size.SMALL, "White");
		Assert.assertThat("fish can sing? ", fish.canSing(), Matchers.is(false));
	}
	
	@Test
	public void testFishCanWalk_ReturnFalse() {
		Fish fish = new Fish(Size.SMALL, "White");
		Assert.assertThat("fish can walk? ", fish.canWalk(), Matchers.is(false));
	}
	
	@Test
	public void testFishWalk_ReturnEmpty() {
		Fish fish = new Fish(Size.SMALL, "White");
		fish.walk();
		Assert.assertThat("Fish can't walk", systemOutRule.getLog(), Matchers.is(""));
	}
	
}
