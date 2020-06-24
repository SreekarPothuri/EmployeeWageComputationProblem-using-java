import java.util.Scanner;
public class EmpWageProblem
{
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static int WagePerHr;
	public static int Max_WorkingHrsPerMonth;
	public static int Max_WorkingDaysPerMonth;
	public static int HrsPerDay;
	public static int Day;
	static int x=0;
	static void EmpCompany() {
		String[] CompanyName={"TCS","Infosys","BridgeLabz","Amazon","Netflix"};
		for(int i=0; i<CompanyName.length; i++){
			x=x+1;
			System.out.println(x+"."+CompanyName[i]);
		}
		Scanner Id = new Scanner(System.in);
		System.out.println("Enter CompanyId");
		int CompanyId = Id.nextInt();
		switch(CompanyId){
			case 1:
				System.out.println("-------------Welcome to TCS-------------------");
				WagePerHr=10;
				Max_WorkingHrsPerMonth=180;
				Max_WorkingDaysPerMonth=26;
				break;
			case 2:
				System.out.println("-------------Welcome to Infosys----------------");
				WagePerHr=20;
				Max_WorkingHrsPerMonth=185;
				Max_WorkingDaysPerMonth=25;
				break;
			case 3:
				System.out.println("--------------Welcome to BridgeLabz------------");
				WagePerHr=30;
				Max_WorkingHrsPerMonth=190;
				Max_WorkingDaysPerMonth=24;
				break;
			case 4:
				System.out.println("--------------Welcome to Amazon-----------------");
				WagePerHr=40;
				Max_WorkingHrsPerMonth=195;
				Max_WorkingDaysPerMonth=23;
				break;
			case 5:
				System.out.println("--------------Welcome to Netflix-----------------");
				WagePerHr=50;
				Max_WorkingHrsPerMonth=200;
				Max_WorkingDaysPerMonth=22;
				break;
			default:
				System.out.println("Invalid CompanyId");
				break;
		}
	}

	static void EmpWage() {

		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp)
		{
			case 0:
				System.out.println("Day#"+Day + " " + "Employee is absent");
				HrsPerDay=0;
				break;
			case 1:
				System.out.println("Day#"+Day +" " + "FullTime Employee and he is present");
				HrsPerDay=8;
				break;
			case 2:
				System.out.println("Day#"+Day +" " +"Part Time Employee and he is present");
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

		EmpCompany();
		System.out.println();
		for(Day=1; Day<=Max_WorkingDaysPerMonth; Day++) {
			if(WorkingHrs <=Max_WorkingHrsPerMonth) {
				EmpWage();
				DailyWage=WagePerHr*HrsPerDay;
				System.out.println("Salary for day : "+DailyWage);
				MonthlyWage=MonthlyWage+DailyWage;
				System.out.println("Total Salary till date : "+MonthlyWage);
				WorkingHrs=WorkingHrs+HrsPerDay;
				System.out.println();
			}
		}
		System.out.println("Toatal Salary for month : " +MonthlyWage);
		System.out.println("Toatal Working Hours : " +WorkingHrs);
	}
}

