package com.bridgelabz.findmaximum;

import java.util.Scanner;

public class Operation {
	public static Integer firstNumber,secondNumber,thirdNumber,max1;
	public static Float number1=0.0f,number2=0.0f,number3=0.0f,max2=0.0f;

	static Scanner sc = new Scanner(System.in);

	public static void getInputForInteger() {
		System.out.println("Enter first integer Number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second integer Number");
		secondNumber = sc.nextInt();
		System.out.println("Enter third integer Number");
		thirdNumber = sc.nextInt();
	}
	public static void getInputForFloat() {
		System.out.println("Enter first float Number");
		number1 = sc.nextFloat();
		System.out.println("Enter second float Number");
		number2 = sc.nextFloat();
		System.out.println("Enter third float Number");
		number1 = sc.nextFloat();
	}
	public static Integer testMaximumInteger(Integer x,Integer y,Integer z) {
		max1 = x;
		if(y.compareTo(max1) > 0){
			max1 = y;
		}
		if(z.compareTo(max1) > 0){
			max1 = z;
		}
		return max1;
	}
	public static Float testMaximumFloat(Float a,Float b,Float c) {
		max2 = a;
		if(b.compareTo(max2) > 0){
			max2 = b;
		}
		if(c.compareTo(max2) > 0){
			max2 = c;
		}
		return max2;
	}

}
