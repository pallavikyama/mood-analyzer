package com.blz.moodanalyzer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyzer {

	protected static String message;
	static Scanner sc = new Scanner(System.in);

	MoodAnalyzer() {
		this(message);
	}

	MoodAnalyzer(String message) {
		analyseMood();
	}

	// UC1
	protected static void analyseMood() {
		try {
			System.out.println(invalidMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	protected static String invalidMood() throws MoodAnalysisException {
		Pattern code = Pattern.compile(".*[Ss][Aa][Dd].*");
		Matcher check = code.matcher(message);
		if (check.matches())
			return "SAD";
		else if(message==null)
			throw new MoodAnalysisException("User entered null message.");
		else if(message=="")
			throw new MoodAnalysisException("User entered empty message.");
		else
			return "HAPPY";
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to MOOD ANALYZER.");
		System.out.println("Enter mood related message:");
		message = sc.nextLine();
		new MoodAnalyzer();
	}
}
