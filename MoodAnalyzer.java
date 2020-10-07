package com.blz.moodanalyzer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyzer {

	static Scanner sc = new Scanner(System.in);

	// UC1
	public static String analyseMood(String text) {
		Pattern code = Pattern.compile(".*[Ss][Aa][Dd].*");
		Matcher check = code.matcher(text);
		if (check.matches())
			return "SAD";
		else
			return "HAPPY";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to MOOD ANALYZER.");
		System.out.println("Enter mood related message:");
		String message = sc.nextLine();
		System.out.println(MoodAnalyzer.analyseMood(message));
		sc.close();
	}
}