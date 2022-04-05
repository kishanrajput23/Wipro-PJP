package com.wipro.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {
	@Test
	public void TestStringConcat() {
	assertEquals("Sanjay Krishna",DailyTasks.doStringConcat("Sanjay","Krishna"));
	}
}
