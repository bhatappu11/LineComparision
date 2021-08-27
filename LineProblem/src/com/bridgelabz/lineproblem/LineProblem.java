package com.bridgelabz.lineproblem;

import java.util.*;

public class LineProblem {
	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation");
		LineProblemIF lineComparision = new LineProblemImpl();
		Scanner sc=new Scanner(System.in);
		Point startPoint = new Point();
		Point endPoint = new Point();
		
		System.out.println("Enter x start coordinate of line 1");
		startPoint.setxCoordinate(sc.nextInt());
		System.out.println("Enter y start coordinate of line 1");
		startPoint.setyCoordinate(sc.nextInt());
		System.out.println("Enter x end coordinate of line 1");
		endPoint.setxCoordinate(sc.nextInt());
		System.out.println("Enter y end coordinate of line 1");
		endPoint.setyCoordinate(sc.nextInt());
		Double lengthOfLine1= lineComparision.findLength(startPoint, endPoint);
		
		System.out.println("Enter x start coordinate of line 2");
		startPoint.setxCoordinate(sc.nextInt());
		System.out.println("Enter y start coordinate of line 2");
		startPoint.setyCoordinate(sc.nextInt());
		System.out.println("Enter x end coordinate of line 2");
		endPoint.setxCoordinate(sc.nextInt());
		System.out.println("Enter y end coordinate of line 2");
		endPoint.setyCoordinate(sc.nextInt());
		Double lengthOfLine2= lineComparision.findLength(startPoint, endPoint);
		
		lineComparision.findEquality(lengthOfLine1, lengthOfLine2);
		lineComparision.compareLines(lengthOfLine1, lengthOfLine2);

	}

}
