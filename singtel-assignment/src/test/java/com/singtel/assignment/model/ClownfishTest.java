package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.singtel.assignment.model.Fish.Size;

public class ClownfishTest extends AbstractTest {

	@Test
	public void testGetSize_ReturnLarge() {
		Clownfish clownfish = new Clownfish();
		Assert.assertThat("size of clownfish is small? ", clownfish.getSize(), Matchers.is(Size.SMALL));
	}
	
	@Test
	public void testGetColor_ReturnColorful() {
		Clownfish clownfish = new Clownfish();
		Assert.assertThat("color of clownfish is colorful? ", clownfish.getColor(), Matchers.is("colorful"));
	}
	
	@Test
	public void testClownfishAction_ReturnMakeJokes() {
		Clownfish clownfish = new Clownfish();
		clownfish.action();
		Assert.assertThat("Clownfish makes jokes", systemOutRule.getLog(), Matchers.is("Make jokes\n"));
	}
}
