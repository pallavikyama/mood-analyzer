package com.blz.moodanalyzer;

public class MoodAnalysisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum MoodAnalysisErrors {
		NULL(null), EMPTY("");
		
		public String value;

		MoodAnalysisErrors(String value) {
			this.value = value;
		}
	}

	public MoodAnalysisException(String check) {
		super(check);
	}
}