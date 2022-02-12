package com.manish.jenkinstest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JenkinControllerTest
{

	@Autowired
	private JenkinController jenkinController;

	@Test void message()
	{
		assertEquals("Hello Jenkins", jenkinController.message());
	}
}