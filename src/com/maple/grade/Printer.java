package com.maple.grade;

public class Printer {

	public static void gradePrint(int sum, float average, String averageCount,
			String result) {

		System.out.println(result);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average + " " + averageCount);

	}
}
