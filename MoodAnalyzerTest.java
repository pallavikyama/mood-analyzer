package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// NULL SCENARIO HANDLING 
		MoodAnalyzer.message=null;
		assertEquals(MoodAnalyzer.analyseMood(), "HAPPY");
	}

}