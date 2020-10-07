package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// SAD TEST-CASE
		String expectedResult = "SAD";
		String actualResult = MoodAnalyzer.analyseMood("I am in sad mood.");
		assertEquals(expectedResult, actualResult);
	}
}