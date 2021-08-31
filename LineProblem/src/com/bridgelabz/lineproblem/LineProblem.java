package com.bridgelabz.lineproblem;

import java.util.*;
public class LineProblem {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to line comparision computation");
		LineProblemIF lineComparision = new LineProblemImpl();
		Line line1 = new Line();
		Line line2 = new Line();
		System.out.println("Enter Line 1 coordinates - (x1,y1) and (x2,y2)");
		int line1X1 = scanner.nextInt();
		int line1Y1 = scanner.nextInt();
		line1.setStartCoordinates(line1X1, line1Y1);
		int line1X2 = scanner.nextInt();
		int line1Y2 = scanner.nextInt();
		line1.setEndCoordinates(line1X2, line1Y2);
		System.out.println("Enter Line 2 Coordinates - (x1,y1) and (x2,y2)");
		int line2X1 = scanner.nextInt();
		int line2Y1 = scanner.nextInt();
		line2.setStartCoordinates(line2X1, line2Y1);
		int line2X2 = scanner.nextInt();
		int line2Y2 = scanner.nextInt();
		line2.setEndCoordinates(line2X2, line2Y2);
					
		lineComparision.findEquality(line1,line2);
		lineComparision.compareLines(line1,line2);
		scanner.close();
	}

}
