package com.bridgelabz.lineproblem;

import java.util.*;
public class LineProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
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

	  	l1=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                l2=Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		length1=String.valueOf(Math.round(l1));
		length2=String.valueOf(Math.round(l2));
  	        if(length1.compareTo(length2)==0)
			System.out.println("equal");
		else if(length1.compareTo(length2)<0)
			System.out.println("l1 is less than l2");
		else
			System.out.println("l1 is greater than l2");
	}

}
