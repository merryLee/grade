package com.maple.grade;

public class Calculator {

	public static String count(int num) {

		if (num >= 90) return "A";
		else if (num >= 80) return "B";
		else if (num >= 70) return "C";
		else if (num >= 60) return "D";
		else return "F";

	}

}
