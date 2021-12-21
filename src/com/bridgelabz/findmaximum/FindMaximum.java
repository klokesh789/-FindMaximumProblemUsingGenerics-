package com.bridgelabz.findmaximum;


public class FindMaximum {
	public static void main(String[] args) {
		Integer Int1 = 99, Int2 = 109, Int3 = 139; 
		Float float1 = 36.67f , float2 = 95.9f, float3 = 78.65f; 
		String xString = "Apple" , yString = "Peach", zString = "Banana"; 

		Operation operation = new Operation(Int1,Int2,Int3);
		int intMax=operation.testMaximum(Int1,Int2,Int3);
		operation.printMax(Int1, Int2, Int3,intMax);
		
		Operation operation1 = new Operation(float1,float2,float3);
		Float floatMax =operation1.testMaximum(float1,float2,float3);
		operation.printMax(float1, float2, float3,floatMax);

		
		Operation operation2 = new Operation(xString,yString,zString);
		String stringMax =operation2.testMaximum(xString,yString,zString);
		operation.printMax(xString, yString, zString,stringMax);
	}
}
