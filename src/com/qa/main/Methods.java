package com.qa.main;

public class Methods {
	
	public int sumOfThreeIntegers(int num1, int num2, int num3) {
		
		int result = 0;
		
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			result = num1 + num2 + num3;
		} else if (num1 == num2 && num2 == num3) {
			result = 0;
		} else if (num1 == num2) {
			result = num3;
		} else if (num1 == num3) {
			result = num2;
		} else if (num2 == num3) {
			result = num3;
		}
		
		return result;
	}

}