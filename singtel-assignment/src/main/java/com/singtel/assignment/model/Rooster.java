package com.singtel.assignment.model;

import java.util.Locale;
import java.util.ResourceBundle;

public class Rooster extends Chicken implements MakeSoundable {

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	@Override
	public void sing(Locale locale) {
		ResourceBundle message = ResourceBundle.getBundle("i18n.message", locale);
		System.out.println(message.getString("rooster"));
	}
}
