package com.maple.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int list[] = new int[5];
		int sum;
		float average;
		String averageCount, result = "";

		Scanner s = new Scanner(System.in);

		System.out.print("점수 5개를 입력해주세요: ");
		for(int i = 0; i < list.length; i++) {
			list[i] = s.nextInt();
		}
		
		for(int i = 0; i < list.length; i++) {
			result = result.concat(list[i] + "");
			result = result.concat(Calculator.count(list[i]) + " ");
		}

		sum = Calculator.sum(list);
		average = Calculator.average(list);
		averageCount = Calculator.count((int) average);

		Printer.gradePrint(sum, average, averageCount, result);
		TextPrinter.filePrint(sum, average, averageCount, result);

	}
}
