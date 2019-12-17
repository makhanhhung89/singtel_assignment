package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.singtel.assignment.model.Butterfly.LifeStage;

public class ButterflyTest extends AbstractTest {

	@Test
	public void testButterflySing_ReturnEmpty() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.sing();
		Assert.assertThat("Butterfly can not sing", systemOutRule.getLog(), Matchers.is(""));
	}
	
	@Test
	public void testButterflyCanSwim_ReturnFalse() {
		Butterfly buffterfly = new Butterfly();
		Assert.assertThat("buffterfly can swim? ", buffterfly.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testButterflyCanSing_ReturnFalse() {
		Butterfly buffterfly = new Butterfly();
		Assert.assertThat("buffterfly can sing? ", buffterfly.canSing(), Matchers.is(false));
	}
	
	@Test
	public void testButterflyAdultFly_ReturnIamflying() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.ADULT_BUTTERFLY);
		buffterfly.fly();
		Assert.assertThat("Butterfly fly correcly", systemOutRule.getLog(), Matchers.is("I am flying\n"));
	}
	
	@Test
	public void testCaterpillarFly_ReturnEmpty() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.fly();
		Assert.assertThat("Caterpillar can not fly", systemOutRule.getLog(), Matchers.is(""));
	}
	
	@Test
	public void testButterflyAdultWalk_ReturnEmpty() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.ADULT_BUTTERFLY);
		buffterfly.walk();
		Assert.assertThat("Butterfly adult canot walk", systemOutRule.getLog(), Matchers.is(""));
	}
	
	@Test
	public void testCaterpillarWalk_ReturnIamwalking() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.walk();
		Assert.assertThat("Caterpillar can walk", systemOutRule.getLog(), Matchers.is("I am walking\n"));
	}
	
	@Test
	public void testButterflyAdultCanFly_ReturnTrue() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.ADULT_BUTTERFLY);
		Assert.assertThat("buffterfly can Fly? ", buffterfly.canFly(), Matchers.is(true));
	}
	

	@Test
	public void testCaterpillarCanFly_ReturnFalse() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.CATERPILLAR);
		Assert.assertThat("Caterpillar can Fly? ", buffterfly.canFly(), Matchers.is(false));
	}
	
	@Test
	public void testButterflyCanWalk_ReturnFalse() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.ADULT_BUTTERFLY);
		Assert.assertThat("buffterfly can walk? ", buffterfly.canWalk(), Matchers.is(false));
	}
	
	@Test
	public void testCaterpillarCanWalk_ReturnTrue() {
		Butterfly buffterfly = new Butterfly();
		buffterfly.setStage(LifeStage.CATERPILLAR);
		Assert.assertThat("Caterpillar can walk? ", buffterfly.canWalk(), Matchers.is(true));
	}
}
