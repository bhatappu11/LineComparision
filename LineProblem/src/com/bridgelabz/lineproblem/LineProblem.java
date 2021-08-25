package com.bridgelabz.lineproblem;

import java.util.*;
public class LineProblem {
	public static double findLength(int x1,int y1, int x2, int y2) {
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
		int x1,x2,x3,x4,y1,y2,y3,y4;
		double l1,l2;
		String length1,length2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter (x1,y1) and (x2,y2) points");
		x1=sc.nextInt();
		y1=sc.nextInt();
 		x2=sc.nextInt();
 		y2=sc.nextInt();
		System.out.println("enter (x3,y3) and (x4,y4) points");
        x3=sc.nextInt();
        y3=sc.nextInt();
        x4=sc.nextInt();
        y4=sc.nextInt();

	  	l1=findLength(x1, y1, x2, y2);
	  	l2=findLength(x3, y3, x4, y4);
		length1=String.valueOf(Math.round(l1));
		length2=String.valueOf(Math.round(l2));
		System.out.println("Using equals method");
		findEquality(length1, length2);
		System.out.println("Using compareTo method");
		compareLines(length1,length2);
		sc.close();
	}

}
