package com.maple.grade;

public class Printer {

	public static void gradePrint(int[] list) {

		int sum;
		float average;
		String averageCount, result = "";

		for(int i = 0; i < list.length; i++) {
			result = result.concat(list[i] + "");
			result = result.concat(Calculator.count(list[i]) + " ");
		}

		sum = Calculator.sum(list);
		average = Calculator.average(list);
		averageCount = Calculator.count((int) average);

		System.out.println(result);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average + " " + averageCount);

		TextPrinter.filePrint(sum, average, averageCount, result);

	}
}
