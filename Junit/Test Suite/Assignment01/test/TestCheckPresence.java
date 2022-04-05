package com.wipro.test;
import static org.junit.Assert.*;

import org.junit.*;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	@Test
	public void TestCheckPresence() {
		// TODO Auto-generated constructor stub
		assertTrue("True", DailyTasks.checkPresence("Sanjay", "a"));
		assertFalse("False", DailyTasks.checkPresence("Sanjay", "t"));
		
	}

}
