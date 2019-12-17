package com.singtel.assignment.model;

import java.util.Locale;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class RoosterTest extends AbstractTest {

	@Test
	public void testRoosterSays_ReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing();
		Assert.assertThat("rooster says ", systemOutRule.getLog(), Matchers.is("Cock-a-doodle-doo\n"));
	}
	
	@Test
	public void testRoosterCanSwim_ReturnFalse() {
		Rooster rooster = new Rooster();
		Assert.assertThat("roostercan swim? ", rooster.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testRoosterCanFly_ReturnFalse() {
		Rooster rooster = new Rooster();
		Assert.assertThat("rooster can fly? ", rooster.canFly(), Matchers.is(false));
	}
	
	@Test
	public void testRoosterSaysInItalia_ReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing(Locale.ITALY);
		Assert.assertThat("chicken says ", systemOutRule.getLog(), Matchers.is("chicchirichi\n"));
	}
	
	@Test
	public void testRoosterSaysInDanish_ReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing(Locale.forLanguageTag("da-DK"));
		Assert.assertThat("chicken says ", systemOutRule.getLog(), Matchers.is("kykyliky\n"));
	}
	
	@Test
	public void testRoosterSaysInGerman_ReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing(Locale.forLanguageTag("de-DE"));
		Assert.assertThat("chicken says ", systemOutRule.getLog(), Matchers.is("kikeriki\n"));
	}
	
	@Test
	public void testRoosterSaysInGreekReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing(Locale.forLanguageTag("el-GR"));
		Assert.assertThat("chicken says ", systemOutRule.getLog(), Matchers.is("kikiriki\n"));
	}
}
