package com.singtel.assignment.model;

import java.util.Locale;

public interface MakeSoundable {

	void sing();
	
	default void sing(Locale locale) {
		sing();
	}
}
