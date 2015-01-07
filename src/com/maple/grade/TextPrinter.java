package com.maple.grade;

import java.io.*;

public class TextPrinter {

	public static void gradeOutput(int[] list) {

		int sum;
		float average;
		char count, averageCount;

		FileWriter fout = null;
		File dst = new File(
				"C:\\Users\\User\\workspace2\\com.maple.grade\\test.txt");

		try {
			
			fout = new FileWriter(dst);

			for (int i = 0; i < list.length; i++) {
				count = Calculator.count(list[i]);
				fout.write(list[i] + "" + count + " ");
			}

			sum = Calculator.sum(list);
			average = Calculator.average(list);
			averageCount = Calculator.count((int) average);

			fout.write("\r\n");
			fout.write("총점: " + sum + "\r\n");
			fout.write("평균: " + average + " " + averageCount + "\r\n");

			fout.close();
			
		} catch (IOException e) {
			System.out.println("출력 오류");
		}
		
	}
}
