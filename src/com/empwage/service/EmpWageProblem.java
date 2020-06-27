package com.empwage.service;
import com.empwage.model.CompanyEmpWage;
public class EmpWageProblem {

        public static final int is_full_time=1;
        public static final int is_part_time=2;

        private static int numOfCompany = 0;
        private static CompanyEmpWage[] companyEmpWageArray;

        public EmpWageProblem(){
                companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company,int WagePerHr,int Max_WorkingDaysPerMonth,int Max_WorkingHrsPerMonth ){
                companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,WagePerHr,Max_WorkingDaysPerMonth,Max_WorkingHrsPerMonth);
                numOfCompany++;
        }

        private static void computeEmpWage() {
                for(int i=0; i<numOfCompany; i++){
                        companyEmpWageArray[i].setTotalEmpWage(computeEmpWage(companyEmpWageArray[i]));
                        System.out.println(companyEmpWageArray[i]);
                }
        }

        private static int computeEmpWage(CompanyEmpWage companyEmpWage){
                int HrsPerDay=0;
                int WorkingHrs=0;
                int Day=0;

                while(WorkingHrs <= companyEmpWage.Max_WorkingHrsPerMonth && Day < companyEmpWage.Max_WorkingDaysPerMonth) {
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
                return WorkingHrs * companyEmpWage.WagePerHr;
        }

        public static void main(String args[]) {
                EmpWageProblem empWage = new EmpWageProblem();
                empWage.addCompanyEmpWage("TCS",10,2,10);
                empWage.addCompanyEmpWage("Infosys",20,4,20);
                empWage.addCompanyEmpWage("BridgeLabz",30,6,30);
                empWage.addCompanyEmpWage("Amazon",40,8,40);
                empWage.addCompanyEmpWage("Netflix",50,10,50);
                EmpWageProblem.computeEmpWage();
        }
}
