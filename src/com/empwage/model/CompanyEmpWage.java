package com.empwage.model;

public class CompanyEmpWage{
	public String company;
	public int WagePerHr;
	public int Max_WorkingDaysPerMonth;
	public int Max_WorkingHrsPerMonth;
	public int MonthlyWage;

	public CompanyEmpWage(String company, int WagePerHr, int Max_WorkingDaysPerMonth, int Max_WorkingHrsPerMonth) {
		this.company = company;
		this.WagePerHr = WagePerHr;
		this.Max_WorkingDaysPerMonth = Max_WorkingDaysPerMonth;
		this.Max_WorkingHrsPerMonth = Max_WorkingHrsPerMonth;
	}

	public void setTotalEmpWage(int MonthlyWage) {
		this.MonthlyWage = MonthlyWage;
	}

	public String toString(){
		return "Total EmpWage for company: " +company+" is: "+MonthlyWage;
	}
}

