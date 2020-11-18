package com.example;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("***Employee Wage Builder Problem***");
		// Constants
		int IS_FULL_TIME = 1;
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if(empcheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
	}
}
