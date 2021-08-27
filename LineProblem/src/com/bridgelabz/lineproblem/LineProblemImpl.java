package com.bridgelabz.lineproblem;

public class LineProblemImpl implements LineProblemIF {

	@Override
	public Double findLength(Point startPoint, Point endPoint) {
		Double length = Double.valueOf(Math.sqrt(Math.pow((startPoint.xCoordinate-endPoint.xCoordinate),2)+Math.pow((startPoint.yCoordinate-endPoint.yCoordinate),2)));
		return length;
	}

	@Override
	public void findEquality(Double lengthOfLine1, Double lengthOfLine2) {
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Two lines are equal");
		}
		else
			System.out.println("Not equal");
		
	}

	@Override
	public void compareLines(Double lengthOfLine1, Double lengthOfLine2) {
		if(lengthOfLine1.compareTo(lengthOfLine2) < 0) {
			System.out.println("line 1 is shorter than line 2");
		}
		else if(lengthOfLine1.compareTo(lengthOfLine2) > 0) {
			System.out.println("line 1 is longer than line 2");
		}
		else 
			System.out.println("line 1 is equal to line 2");
		
	}
	
}
