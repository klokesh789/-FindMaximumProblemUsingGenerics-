package com.bridgelabz.findmaximum;

import java.util.Scanner;
public class FindMaximum {
	static Integer firstNumber,secondNumber,thirdNumber;

	public static void main(String[] args) {
		getInput();
		testMaximum(firstNumber,secondNumber,thirdNumber);

	}
	public static void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second Number");
		secondNumber = sc.nextInt();
		System.out.println("Enter third Number");
		thirdNumber = sc.nextInt();
	}
	public static void testMaximum(Integer x,Integer y,Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0){
			max = y;
		}
		if(z.compareTo(max) > 0){
			max = z;
		}
		System.out.println(max+" is maximum number");
	}

}
