package com.blz.moodanalyzer;

public class MoodAnalysisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum MoodAnalysisErrors {
		NULL(null), EMPTY("");
		
		String value;
		
		MoodAnalysisErrors(String value) {
			this.value = value;
		}
	}
	MoodAnalysisErrors obj;
	public MoodAnalysisException(String check) {
		super(check);
	}
}