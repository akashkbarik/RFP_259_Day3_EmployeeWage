package day3.assignment.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to the EmployeeWage program\n...............................");
        //Constant
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int SALARY_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int MAX_HRS_IN_MONTH = 100;
        //Variables
        int empCheck;

        int empHr;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHr = 8;
                    break;

                case IS_PART_TIME:
                    empHr = 4;
                    break;

                default:
                    empHr = 0;
            }

            totalEmpHrs += empHr;
            System.out.println("#Day: " + totalWorkingDays + " EmpHrs: " + empHr);


        }
        System.out.println("Total emp hours of the employee = " + totalEmpHrs);
        int totalEmpWage = totalEmpHrs * SALARY_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}


