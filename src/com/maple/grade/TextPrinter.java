package com.maple.grade;

import java.io.*;

public class TextPrinter {

	public static void filePrint(int sum, float average, String averageCount,
			String result) {

		FileWriter fout = null;
		File dst = new File(
				"C:\\Users\\User\\workspace2\\com.maple.grade\\test.txt");

		try {

			fout = new FileWriter(dst);

			fout.write(result + "\r\n");
			fout.write("총점: " + sum + "\r\n");
			fout.write("평균: " + average + " " + averageCount + "\r\n");

			fout.close();
		} catch (IOException e) {
			System.out.println("출력 오류");
		}
	}
}
