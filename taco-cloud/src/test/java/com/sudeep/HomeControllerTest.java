package com.sudeep;

import static org.hamcrest.CoreMatchers.containsString;
 import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.sudeep.controllers.HomeController;


@WebMvcTest(HomeController.class)
@ContextConfiguration(classes=TacoCloudApplication.class)
class HomeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	 
	
	@Test
	public void testHomePage() throws Exception {
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("home"))
		.andExpect(content().string(
				containsString("Welcome to...")));
		
		
	}

}
