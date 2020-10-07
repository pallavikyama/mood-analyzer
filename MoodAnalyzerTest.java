package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// HAPPY TEST-CASE
		String expectedResult = "HAPPY";
		String actualResult = MoodAnalyzer.analyseMood("I am in any mood.");
		assertEquals(expectedResult, actualResult);
	}
	
}