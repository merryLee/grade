package com.maple.grade;

public class Print {

	public static void gradePrint(int[] list) {
		
		int sum;
		float average;
		char count, averageCount;
		
		for(int i=0; i<list.length; i++) {
			count = Calculator.count(list[i]);
			System.out.print(list[i]+""+count+" ");
		}
		
		sum = Calculator.sum(list);
		average = Calculator.average(list);
		averageCount = Calculator.count((int)average);
		
		System.out.println();
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average+" "+averageCount);

	}	
}
