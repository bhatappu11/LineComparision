package com.bridgelabz.lineproblem;

import java.util.*;
public class LineProblem {
	public static double findLength(int x1,int y1, int x2, int y2) {
		double length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation");
		int x1,x2,y1,y2;
		double length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter (x1,y1) and (x2,y2) points");
        x1=sc.nextInt();
	    y1=sc.nextInt();
 		x2=sc.nextInt();
 		y2=sc.nextInt();
        length = findLength(x1, y1, x2, y2);
		System.out.println("the length is: "+length);
		sc.close();
	}

}
