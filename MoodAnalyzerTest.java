package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// SAD TEST-CASE REPEAT
		MoodAnalyzer.message = "I am in sad mood.";
		String expectedResult = "SAD";
		String actualResult = MoodAnalyzer.analyseMood();
		assertEquals(expectedResult, actualResult);
	}
}