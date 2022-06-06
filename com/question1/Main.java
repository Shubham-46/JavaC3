package com.question1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Your array is");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Please enter the element to search");
		try {
			int ab = sc.nextInt();
			try {
				System.out.println("The element of array at index "+ab+"==="+ arr[a]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			}
		}
		catch(Exception e) {
			System.out.println("java.lang.NumberFormatException");
		}
		
		
	}
}
