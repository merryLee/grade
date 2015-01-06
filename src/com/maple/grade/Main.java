package com.maple.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;
		String grade;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수입력: ");
		num = s.nextInt();
		grade = Calculator.count(num);

		System.out.println("학점: "+grade);
	}

}
