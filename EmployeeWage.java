package day3.assignment.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to the EmployeeWage program\n...............................");
        //Constant
        final int IS_PRESENT = 1;
        final int IS_PART_TIME = 2;
        final int SALARY_PER_HOUR = 20;
        final int TOTAL_WORK_DAY = 20;

        //Variables
        int empCheck;
        int empHr ;
        int totalSalary = 0;

        for (int i=1;i<=TOTAL_WORK_DAY;i++) {
            empCheck = (int)(Math.floor(Math.random() * 10) % 3);
            System.out.println(empCheck);
            switch(empCheck) {
                case IS_PRESENT :
                    empHr = 8;
                    break;

                case IS_PART_TIME :
                    empHr=4;
                    break;

                default :
                    empHr=0;
                    break;
            }

            double empSalary = empHr * SALARY_PER_HOUR;
            totalSalary+=empSalary;
            totalSalary = totalSalary + (int)empSalary;

        }

        System.out.println("Monthly Emp Wage : "+totalSalary);
    }
}


