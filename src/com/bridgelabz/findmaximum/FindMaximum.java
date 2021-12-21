package com.bridgelabz.findmaximum;


public class FindMaximum {
	public static void main(String[] args) {
		Operation operation = new Operation();
		operation.getInputForInteger();
		operation.testMaximumInteger(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(operation.max1+" is maximum amongst integer numbers");
		operation.getInputForFloat();
		operation.testMaximumFloat(operation.number1,operation.number2,operation.number3);
		System.out.println(operation.max2+" is maximum amongst float numbers");
	}

}
