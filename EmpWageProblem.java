public class EmpWageProblem
{
	public static void main(String args[])
	{
		int is_full_time=1;
		int is_part_time=2;

		int WagePerHr=20;
		int HrsPerDay_fullTime=8;
		int HrsPerDay_PartTime=4;
		int DailyWageSalary;

		System.out.println("Welcome to Employee Wage Computation Program");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;

		if(EmpCheck == 1)
		{
			System.out.println("Full Time Employee and is present");
			DailyWageSalary=WagePerHr*HrsPerDay_fullTime;
			System.out.println("Salary : "+DailyWageSalary);
		}
		else if(EmpCheck ==2)
		{
			System.out.println("Part Time Employee and is present");
			DailyWageSalary=WagePerHr*HrsPerDay_PartTime;
			System.out.println("Salary : "+DailyWageSalary);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
