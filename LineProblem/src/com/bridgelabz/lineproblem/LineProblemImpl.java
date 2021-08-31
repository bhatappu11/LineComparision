package com.bridgelabz.lineproblem;

public class LineProblemImpl implements LineProblemIF {
	@Override
	public void findEquality(Line l1,Line l2) {
		Double lengthOfLine1 = findLength(l1);
		Double lengthOfLine2 = findLength(l2);
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Two lines are equal");
		}
		else
			System.out.println("Not equal");
		
	}

	@Override
	public void compareLines(Line l1,Line l2) {
		Double lengthOfLine1 = findLength(l1);
		Double lengthOfLine2 = findLength(l2);
		if(lengthOfLine1.compareTo(lengthOfLine2) < 0) {
			System.out.println("line 1 is shorter than line 2");
		}
		else if(lengthOfLine1.compareTo(lengthOfLine2) > 0) {
			System.out.println("line 1 is longer than line 2");
		}
		else 
			System.out.println("line 1 is equal to line 2");
		
	}

	@Override
	public Double findLength(Line line) {
		int x1 = line.getStartCoordinates().getxCoordinate();
		int y1 = line.getStartCoordinates().getyCoordinate();
		int x2 = line.getEndCoordinates().getxCoordinate();
		int y2 = line.getEndCoordinates().getyCoordinate();
		Double length = Double.valueOf(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return length;
	}
	
	
}
