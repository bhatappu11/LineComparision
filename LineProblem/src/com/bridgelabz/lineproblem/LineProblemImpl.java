package com.bridgelabz.lineproblem;

public class LineProblemImpl implements LineProblemIF {
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
