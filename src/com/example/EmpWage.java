package com.example;

	public class EmpWage {

		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HR = 20;
		public static final int NUM_OF_WORKING_DAYS = 2;

		public static void main(String args[]) {
			System.out.println("***Welcome to EmpWage Details***");
			// Variables
			int empHrs = 0, empWage = 0, totalEmpWage = 0;
			// Computation
			for(int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
				int empcheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empcheck) {
					case IS_PART_TIME:
						empHrs = 4;
						System.out.println("Employee is Present");
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						System.out.println("Employee is Present");		
						break;
					default:
						empHrs = 0;
						System.out.println("Employee is Abscent");
				}

				empWage = empHrs * EMP_RATE_PER_HR;
				totalEmpWage += empWage;
				System.out.println("Emp Wage: "+empWage);
			}
			System.out.println("Total Emp Wage: "+totalEmpWage);
		}
	}