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
		System.out.println(analyseMood());
	}

	// UC1
	protected static String analyseMood() {
		Pattern code = Pattern.compile(".* [Ss][Aa][Dd] .*");
		Matcher check = code.matcher(message);
		if (check.matches())
			return "SAD";
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
