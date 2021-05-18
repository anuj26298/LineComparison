package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class FindLengthAndCompare {
	public static void main(String[] args) {
		//Scanner Class Object
		Scanner scan = new Scanner(System.in);
		
		// Input x co-ordinates
		System.out.println("Enter first two co-ordiantes");
		int X1 = scan.nextInt();
		int X2 = scan.nextInt();
		
		//Input y co-ordinates
		System.out.println("Enter second two co-ordiantes");
		int Y1 = scan.nextInt();
		int Y2 = scan.nextInt();
		
		
		// Computing length of line
		
		double LENGTH1 = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
		
		System.out.println("Length of Line1 is: " + LENGTH1);
		
		System.out.println("Enter thrid two co-ordiantes");
		 
		int M1 = scan.nextInt();
		int M2 = scan.nextInt();
		
		System.out.println("Enter fourth two co-ordiantes");
		
		int N1 = scan.nextInt();
		int N2 = scan.nextInt();
		
		double LENGTH2 = Math.sqrt((M2-M1)*(M2-M1) + (N2-N1)*(N2-N1));
		
		System.out.println("Length of Line2 is: " + LENGTH2);
		
		// Converting double to string to use comparTo and equals method
		String FIRST_LINE = LENGTH1 + "";
		String SECOND_LINE = LENGTH2 + "";
		
		//comparing using equals()
		
		if(FIRST_LINE.equals(SECOND_LINE))
			System.out.println("Two lines are equal.");
		else
			System.out.println("Lines are not equal.");
		
		//comparing lines using compareTo method
		
		double CHECK_LEN = FIRST_LINE.compareTo(SECOND_LINE);
		
		if(CHECK_LEN == 0.0)
			System.out.println("Lines are equal");
		else if (CHECK_LEN < 0.0)
			System.out.println("Line1 is Smaller");
		else
			System.out.println("Line2 is Smaller ");
	}
}
