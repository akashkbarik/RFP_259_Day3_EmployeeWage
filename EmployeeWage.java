package day3.assignment.employeewage;

public class EmployeeWage {
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public static void main(String[] args) {

        EmployeeWage dmart = new EmployeeWage("Dmart", 20, 28, 100);


        int empHr = 0;
        int totalemphr = 0;
        int totalWorkingDays = 0;
        while (totalemphr <= dmart.maxHoursPerMonth && totalWorkingDays <= dmart.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHr = 8;
                    break;

                case IS_PART_TIME:
                    empHr = 4;
                    break;

                default:
                    empHr = 0;
                    break;
            }
            totalemphr += empHr;
            System.out.println("Working day : " + totalWorkingDays + " (Present : " + empCheck + ")");
        }
        int totalSalary = totalemphr * dmart.empRatePerHour;
        System.out.println("Monthly Emp Wage for the company: " + dmart.company + " " + totalSalary + "\nTotal working hour : " + totalemphr);
    }

}


