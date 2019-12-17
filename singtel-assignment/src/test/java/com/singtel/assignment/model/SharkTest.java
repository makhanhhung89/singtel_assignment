package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.singtel.assignment.model.Fish.Size;

public class SharkTest extends AbstractTest {
	
	@Test
	public void testGetSize_ReturnLarge() {
		Shark shark = new Shark();
		Assert.assertThat("size of shark is Large? ", shark.getSize(), Matchers.is(Size.LARGE));
	}
	
	@Test
	public void testGetColor_ReturnGrey() {
		Shark shark = new Shark();
		Assert.assertThat("color of shark is grey? ", shark.getColor(), Matchers.is("Grey"));
	}
	
	@Test
	public void testSharkAction_ReturnEatOtherFish() {
		Shark shark = new Shark();
		shark.action();
		Assert.assertThat("Shark eat other fish", systemOutRule.getLog(), Matchers.is("Eat other fish\n"));
	}

}
