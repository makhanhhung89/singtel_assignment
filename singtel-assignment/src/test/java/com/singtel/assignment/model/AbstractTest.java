package com.singtel.assignment.model;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class AbstractTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
}
