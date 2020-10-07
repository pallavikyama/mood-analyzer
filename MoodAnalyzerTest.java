package com.blz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void moodTest() {
		// EMPTY MESSAGE SCENARIO HANDLING
		try {
			MoodAnalyzer.message = "";
			MoodAnalyzer.invalidMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.MoodAnalysisErrors.EMPTY, e.obj);
		}
	}
}