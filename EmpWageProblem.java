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

		int WorkingDaysPerMonth=20;
		int MonthlyWage;

		System.out.println("Welcome to Employee Wage Computation Program");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp)
		{
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("FullTime Employee and he is present");
				DailyWage=WagePerHr*HrsPerDay_fullTime;
				System.out.println("Salary per day : "+DailyWage);
				MonthlyWage=DailyWage*WorkingDaysPerMonth;
				System.out.println("Salary for month : "+MonthlyWage);
				break;
			case 2:
				System.out.println("Part Time Employee and he is present");
				DailyWage=WagePerHr*HrsPerDay_PartTime;
				System.out.println("Salary per Day : "+DailyWage);
				MonthlyWage=DailyWage*WorkingDaysPerMonth;
				System.out.println("Salary for month : "+MonthlyWage);
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}
}
