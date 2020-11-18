package com.example;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("***Employee Wage Builder Problem***");
		// Constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
		// Variables
		int empHrs = 0;
		int empWage = 0;
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if(empcheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is Abscent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Emp Wage: "+empWage);
	}
}
