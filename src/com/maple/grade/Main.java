package com.maple.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int list[] = new int[5];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수 5개를 입력해주세요: ");
		for(int i=0; i<list.length; i++) {
			list[i]=s.nextInt();
		}
		
		Printer.gradePrint(list);
		
		TextPrinter.gradeOutput(list);
	}
}
