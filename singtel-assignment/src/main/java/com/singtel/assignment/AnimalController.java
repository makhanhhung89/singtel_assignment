package com.singtel.assignment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.SupportedAnimal;

@RestController
public class AnimalController {

	@RequestMapping(value = "/animals", method = RequestMethod.GET)
	public ResponseEntity<Animal> getAnimal(@RequestParam("type") String requestAnimal) {	
		SupportedAnimal requestType = SupportedAnimal.valueOf(requestAnimal);
		return new ResponseEntity<Animal>(requestType.createSpecificResource(), HttpStatus.OK);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleExpectedExeption(RuntimeException ex) {
		return new ResponseEntity<String>("Invalid parameter", HttpStatus.BAD_REQUEST);
	}
}
