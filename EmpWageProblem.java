public class EmpWageProblem
{
	public static void main(String args[])
	{
		int is_full_time=1;
		int is_part_time=2;

		int WagePerHr=20;
		int HrsPerDay_fullTime=8;
		int HrsPerDay_PartTime=4;
		int DailyWage;

		int Max_WorkingHrsPerMonth=100;
		int Max_WorkingDaysPerMonth=20;
		int MonthlyWage=0;

		int WorkingHrs=0;

		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println();

		for(int i=1; i<=Max_WorkingDaysPerMonth; i++)
		{
			if(WorkingHrs<=100)
			{
				double EmpCheck = Math.floor(Math.random() * 10) % 3;
				int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

				switch(CheckEmp)
				{
					case 0:
						System.out.println("Employee is absent");
						System.out.println("Salary per day : 0");
						System.out.println("Total Salary till date : "+MonthlyWage);
						System.out.println();
						break;
					case 1:
						System.out.println("FullTime Employee and he is present");
						DailyWage=WagePerHr*HrsPerDay_fullTime;
						System.out.println("Salary per day : "+DailyWage);
						MonthlyWage=MonthlyWage+DailyWage;
						WorkingHrs=WorkingHrs+HrsPerDay_fullTime;
						System.out.println("Total Salary till date : "+MonthlyWage);
						System.out.println();
						break;
					case 2:
						System.out.println("Part Time Employee and he is present");
						DailyWage=WagePerHr*HrsPerDay_PartTime;
						System.out.println("Salary per Day : "+DailyWage);
						MonthlyWage=MonthlyWage+DailyWage;
						WorkingHrs=WorkingHrs+HrsPerDay_PartTime;
						System.out.println("Total Salary till date : "+MonthlyWage);
						System.out.println();
						break;
					default:
						System.out.println("Invalid");
						break;
				}
			}
		}

		System.out.println("Toatal Salary for month : " +MonthlyWage);
		System.out.println("Toatal Working Hours : " +WorkingHrs);
	}
}
