package com.example;

	public class EmpWage {

		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HR = 20;
	
		public static void main(String args[]) {
			System.out.println("***Employee Wage Builder Problem***");
			// Variables
			int empHrs = 0;
			int empWage = 0;
			// Computation
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
				case IS_PART_TIME:
					empHrs = 4;
					System.out.println("Employee is Present and Part time");
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					System.out.println("Employee is Present and Full time");		
					break;
				default:
					empHrs = 0;
					System.out.println("Employee is Abscent");
			}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Emp Wage: "+empWage);
	}
}