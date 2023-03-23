package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		double isRunning;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key for start the stopwatch");
		char start = sc.next().charAt(0);
		
		startTime = System.currentTimeMillis();
		System.out.println("Press any key for stop the stopwatch");
		char end = sc.next().charAt(0);
		endTime = System.currentTimeMillis();
		isRunning = (endTime - startTime) / 1000.0 ;
		
		System.out.println("Elapsed time: " +isRunning);

	}

}
