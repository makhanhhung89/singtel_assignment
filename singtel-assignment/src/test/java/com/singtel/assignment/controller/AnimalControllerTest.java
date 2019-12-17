package com.singtel.assignment.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.singtel.assignment.AnimalController;
import com.singtel.assignment.model.SupportedAnimal;

@RunWith(SpringRunner.class)
@WebMvcTest(AnimalController.class)
public class AnimalControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetAnimal_getBird_ReturnBirdCanFlyAndCanotSwim() throws Exception {
		
		mockMvc.perform(get("/animals?type=" + SupportedAnimal.BIRD.name()).contentType(MediaType.APPLICATION_JSON))
			.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.canFly", is(true)))
				.andExpect(jsonPath("$.canSwim", is(false)));
	}
	
	@Test
	public void testGetAnimal_IncorrectAnimalType_ReturnBadRequest() throws Exception {
		
		mockMvc.perform(get("/animals?type=nothing").contentType(MediaType.APPLICATION_JSON))
			.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isBadRequest());
	}
}
