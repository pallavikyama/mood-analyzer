package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// NULL SCENARIO HANDLING
		try {
			MoodAnalyzer.message = null;
			MoodAnalyzer.invalidMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.MoodAnalysisErrors.NULL.value, e.obj);
		}
	}
}