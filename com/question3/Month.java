package com.question3;
import java.util.Scanner;

public enum Month {
	JAN,
	FEB,
	MAR,
	APR,
	MAY,
	JUN,
	JUL,
	AUG,
	SEP,
	OCT,
	NOV,
	DEC;
}
class Demo{
	void showDetails(Month m){
			switch(m) {
			case JAN:
				System.out.println("This is the 1st Month of the Year January");
				break;
			case FEB:
				System.out.println("This is the 2nd Month of the Year February");
				break;
			case MAR:
				System.out.println("This is the 3rd Month of the Year February");
				break;
			case APR:
				System.out.println("This is the 4th Month of the Year February");
				break;
			case MAY:
				System.out.println("This is the 5th Month of the Year February");
				break;
			case JUN:
				System.out.println("This is the 6th Month of the Year February");
				break;
			case JUL:
				System.out.println("This is the 7th Month of the Year February");
				break;
			case AUG:
				System.out.println("This is the 8th Month of the Year February");
				break;
			case SEP:
				System.out.println("This is the 9th Month of the Year February");
				break;
			case OCT:
				System.out.println("This is the 10th Month of the Year February");
				break;
			case NOV:
				System.out.println("This is the 11th Month of the Year February");
				break;
			case DEC:
				System.out.println("This is the 12th Month of the Year February");
				break;
			}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Please enter the month");
			String s=sc.next();
			Demo d=new Demo();
			Month m=Month.valueOf(s.toUpperCase());
			d.showDetails(m);
		}
		catch(Exception e) {
			System.out.println("Invalid Month Name");
		}
		
		
	}
}
