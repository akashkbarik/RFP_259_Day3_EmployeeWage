package day3.assignment.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder("John");
        empWageBuilder.addCompany(new Company("INFOSYS", 8, 20, 20, 60));
        empWageBuilder.addCompany(new Company("WIPRO", 8, 20, 20, 60));
        empWageBuilder.addCompany(new Company("Dmart", 6, 40, 25, 100));
        empWageBuilder.addCompany(new Company("RELAINCE", 6, 40, 25, 100));
        empWageBuilder.addCompany(new Company("TCS", 6, 40, 25, 100));
        empWageBuilder.addCompany(new Company("NTT", 6, 40, 25, 100));

        empWageBuilder.calculateAllCompaniesEmpWage();

    }

}