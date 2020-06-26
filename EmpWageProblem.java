public class EmpWageProblem {

        public static final int is_full_time=1;
        public static final int is_part_time=2;

	private final String company;
	private final int WagePerHr;
	private final int Max_WorkingDaysPerMonth;
	private final int Max_WorkingHrsPerMonth;
	private int MonthlyWage;

	public EmpWageProblem(String company, int WagePerHr, int Max_WorkingDaysPerMonth, int Max_WorkingHrsPerMonth) {
		this.company = company;
		this.WagePerHr = WagePerHr;
		this.Max_WorkingDaysPerMonth = Max_WorkingDaysPerMonth;
		this.Max_WorkingHrsPerMonth = Max_WorkingHrsPerMonth;
	}

        public void computeEmpWage() {
		int HrsPerDay=0;
                int WorkingHrs=0;
                int Day=0;

                while(WorkingHrs <= Max_WorkingHrsPerMonth && Day < Max_WorkingDaysPerMonth) {
                        Day++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch(empCheck) {
                                case is_full_time:
					System.out.print("Day#"+Day+" "+"FullTime Employee and he is present");
                                        HrsPerDay=8;
                                        break;
                                case is_part_time:
					System.out.print("Day#"+Day+" "+"PartTime Employee and he is present");
                                        HrsPerDay=4;
                                        break;
                                default:
					System.out.print("Day#"+Day+" "+"Employee is Absent");
                                        HrsPerDay=0;
                                        break;
                        }
                        WorkingHrs += HrsPerDay;
                        System.out.println("\t"+"Emp Hr : " +HrsPerDay);
                }
                MonthlyWage = WorkingHrs * WagePerHr;
        }

	@Override
	public String toString() {
		return "*****Total Emp Wage for Company " +company+ " is "+MonthlyWage+"*****";
	}

        public static void main(String args[]) {
		EmpWageProblem TCS = new EmpWageProblem("TCS",10,2,10);
		EmpWageProblem Infosys = new EmpWageProblem("Infosys",20,4,15);
		EmpWageProblem BridgeLabz = new EmpWageProblem("BridgeLabz",30,6,20);
		EmpWageProblem Amazon = new EmpWageProblem("Amazon",40,8,25);
		EmpWageProblem Netflix = new EmpWageProblem("Netflix",50,10,30);

                TCS.computeEmpWage();
		System.out.println(TCS);
                Infosys.computeEmpWage();
		System.out.println(Infosys);
                BridgeLabz.computeEmpWage();
		System.out.println(BridgeLabz);
                Amazon.computeEmpWage();
		System.out.println(Amazon);
                Netflix.computeEmpWage();
		System.out.println(Netflix);
        }
}
