package com.example;

public class EmpWage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;

	static String company;
	static int empRatePerHour,empWage, numOfWorkingDays, maxHoursPerMonth, totalEmpWage;
public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
{
	this.company=company;
	this.empRatePerHour=empRatePerHour;
	this.numOfWorkingDays=numOfWorkingDays;
	this.maxHoursPerMonth=maxHoursPerMonth;
	}

public int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	int empHrs =0,totalEmpHrs=0,totalWorkingDays=0;
	
	System.out.println("Company :"+company);
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
			
			int totalEmpWage =  totalEmpHrs *empRatePerHour;
			totalEmpWage += empWage;
			
			System.out.println(totalWorkingDays+" "+totalEmpHrs);
			System.out.println("Total Emp Wage: " + totalEmpWage);
			}
	
	return totalEmpWage;
}
public static void main(String[] args) {
	EmpWage dMart=new EmpWage("DMart",20,2,10);
	EmpWage reliance=new EmpWage("Reliance",10,4,20);
	
	dMart.computeEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	
	reliance.computeEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	
	}
}
/*
public String toString(){
System.out.println("Total Emp Wage for Company"+company+" is: "+ totalEmpWage  );
return company;
*/