package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class DolphinTest extends AbstractTest {
	@Test
	public void testDolphinCanSwim_ReturnTrue() {
		Dolphin dolphin = new Dolphin();
		Assert.assertThat("dolphin can swim? ", dolphin.canSwim(), Matchers.is(true));
	}
	
	@Test
	public void testDolphinCanFly_ReturnFalse() {
		Dolphin dolphin = new Dolphin();
		Assert.assertThat("dolphin can Fly? ", dolphin.canFly(), Matchers.is(false));
	}
	
	@Test
	public void testDolphinCanSing_ReturnFalse() {
		Dolphin dolphin = new Dolphin();
		Assert.assertThat("dolphin can sing? ", dolphin.canSing(), Matchers.is(false));
	}
	
	@Test
	public void testDolphinCanWalk_ReturnFalse() {
		Dolphin dolphin = new Dolphin();
		Assert.assertThat("dolphin can walk? ", dolphin.canWalk(), Matchers.is(false));
	}
}
