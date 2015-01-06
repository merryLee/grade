package com.maple.grade;

public class Calculator {

	public static char count(int num) {
		
		if (num >= 90) return 'A';
		else if (num >= 80) return 'B';
		else if (num >= 70) return 'C';
		else if (num >= 60) return 'D';
		else return 'F';
	}

	public static int sum(int[] list) {
		
		int i=0;
		int sum=0;
		while(i<list.length){
			sum+=list[i];
			i++;
		}
		return sum;		
	}
	
	public static float average(int[] list) {
		
		int i=0;
		float average=0;
		while(i<list.length){
			average+=list[i];
			i++;
		}
		return average/list.length;
	}	
	
}
