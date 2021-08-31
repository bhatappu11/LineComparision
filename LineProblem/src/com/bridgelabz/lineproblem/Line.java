package com.bridgelabz.lineproblem;

public class Line {
	Point startCoordinates = new Point();
	Point endCoordinates = new Point();

	public Point getEndCoordinates() {
		return endCoordinates;
	}
	public Point getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int x1, int y1) {
		startCoordinates.setxCoordinate(x1);
		endCoordinates.setyCoordinate(y1);
	}

	public void setEndCoordinates(int x2, int y2) {
		startCoordinates.setxCoordinate(x2);
		endCoordinates.setyCoordinate(y2);
	}
	
}
