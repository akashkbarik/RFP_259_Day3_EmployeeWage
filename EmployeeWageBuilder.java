package day3.assignment.employeewage;

public class EmployeeWageBuilder {
    String empName;
    Company[] companies;
    private int numOfCompany;

    public EmployeeWageBuilder(String empName) {
        this.empName = empName;
        companies = new Company[100];
    }

    public void addCompany(Company company) {
        companies[numOfCompany++] = company;
    }

    public void calculateAllCompaniesEmpWage() {
        for (Company company : companies) {
            if (company == null) {
                break;
            }
            company.calculateEmpWage();
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        String str = "";
        for (Company company : companies) {
            if (company == null) {
                break;
            }
            str = str.concat("\n-----------------------------------\n" + company);
        }
        return str;
    }
}

