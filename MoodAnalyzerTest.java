package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// HAPPY TEST-CASE REPEAT
		MoodAnalyzer.message = "I am in any mood.";
		String expectedResult = "HAPPY";
		String actualResult = MoodAnalyzer.analyseMood();
		assertEquals(expectedResult, actualResult);
	}
}