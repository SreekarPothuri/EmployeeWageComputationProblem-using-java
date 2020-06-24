public class EmpWageProblem
{
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static final int WagePerHr=20;
	public static final int Max_WorkingHrsPerMonth=100;
	public static final int Max_WorkingDaysPerMonth=20;
	public static int HrsPerDay;
	public static int Day;

	public static void EmpWage() {

		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp)
		{
			case 0:
				System.out.println("Day:"+Day + " " + "Employee is absent");
				HrsPerDay=0;
				break;
			case 1:
				System.out.println("Day:"+Day +" " + "FullTime Employee and he is present");
				HrsPerDay=8;
				break;
			case 2:
				System.out.println("Day:"+Day +" " +"Part Time Employee and he is present");
				HrsPerDay=4;
				break;
			default:
				System.out.println("Invalid");
				break;
			}
	}

	public static void main(String args[])
	{
		int DailyWage;
		int MonthlyWage=0;
		int WorkingHrs=0;

		for(Day=1; Day<=Max_WorkingDaysPerMonth; Day++) {
			if(WorkingHrs <=100) {
				EmpWage();
				DailyWage=WagePerHr*HrsPerDay;
				System.out.println("Salary for day : "+DailyWage);
				MonthlyWage =+ DailyWage;
				System.out.println("Total Salary till date : "+MonthlyWage);
				WorkingHrs=WorkingHrs+HrsPerDay;
				System.out.println();
			}
		}
		System.out.println("Toatal Salary for month : " +MonthlyWage);
		System.out.println("Toatal Working Hours : " +WorkingHrs);
	}
}

