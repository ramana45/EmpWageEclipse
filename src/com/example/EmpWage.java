package com.example;

public class EmpWage{
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		int empHrs=0, empWage=0,totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Company : "+company);	
	while(totalEmpHrs <= maxHoursPerMonth &&
		totalWorkingDays <= numOfWorkingDays) {
		totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random()*10)%3;
	
		switch(empCheck) {
		case IS_FULL_TIME:
			empHrs=8;
			break;
		case IS_PART_TIME:
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
		
	totalEmpHrs +=empHrs;
	System.out.println("Day#: " + totalWorkingDays + " EMpe Hr: " +empHrs);
	
	totalEmpWage = totalEmpHrs * empRatePerHour;
	totalEmpWage += empWage;
	
	System.out.println(totalWorkingDays+" "+totalEmpHrs);
	System.out.println("Total Emp Wage: " + totalEmpWage);
	}
	return totalEmpWage;	
}

public static void main(String[] args){

	computeEmpWage("DMart",20,2,10);
	computeEmpWage("Reliance",10,4,20);
	}
}
