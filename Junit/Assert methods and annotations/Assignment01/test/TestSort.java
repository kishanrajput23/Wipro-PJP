package com.wipro.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.task.DailyTasks;


public class TestSort {
	@Test
	public void TestSort() {
		 int[] arr = {5,4,3,2,1};
		   int[] expected = {1,2,3,4,5};
		   DailyTasks.sortValues(arr); // or whatever your sort method call it like
		   assertArrayEquals(expected, arr);
		
	}

}
