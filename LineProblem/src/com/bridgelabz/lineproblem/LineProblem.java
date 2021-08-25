package com.bridgelabz.lineproblem;

import java.util.*;
public class LineProblem {
	int x1,x2,y1,y2;
	public LineProblem(int x1,int y1,int x2,int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public double findLength() {
		double length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}
	public static void findEquality(String length1,String length2) {
		if(length1.equals(length2))
			System.out.println("equal");
		else
			System.out.println("not equal");
  	    
	}
	public static void compareLines(String length1,String length2) {
		 if(length1.compareTo(length2)==0)
				System.out.println("equal");
		 else if(length1.compareTo(length2)<0)
				System.out.println("line 1 is less than line 2");
		 else
				System.out.println("line 1 is greater than line 2");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation");
		double l1,l2;
		String length1,length2;
		Scanner sc=new Scanner(System.in);
		LineProblem line1 = new LineProblem(1, 8, 3, 4);
		LineProblem line2 = new LineProblem(2, 9, 3, 6);

	  	l1 = line1.findLength();
	  	l2 = line2.findLength();
		length1=String.valueOf(Math.round(l1));
		length2=String.valueOf(Math.round(l2));
		System.out.println("Using equals method");
		findEquality(length1, length2);
		System.out.println("Using compareTo method");
		compareLines(length1,length2);
		sc.close();
	}

}
