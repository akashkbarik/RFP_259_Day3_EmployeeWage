package day3.assignment.employeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EmployeeWageBuilder implements IEmployeeWage {
    String empName;
    List<Company> companies;
    Map<String, Company> companiesMap;

    public EmployeeWageBuilder(String empName) {
        this.empName = empName;
        companies = new LinkedList<Company>();
        companiesMap = new HashMap<String, Company>();
    }

    public void addCompany(Company company) {
        companies.add(company);
        calculateAllCompaniesEmpWage();
    }

    public void calculateAllCompaniesEmpWage() {
        for (Company company : companies) {
            if (!companiesMap.containsKey(company.companyName)) {
                company.calculateEmpWage();
                companiesMap.put(company.companyName, company);
            }
        }
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


    public int getTotalWage(String companyName) {
        return companiesMap.get(companyName).totalEmpWage;
    }

    public Company getCompany(int index) {
        return companies.get(index);
    }

    public Company getCompany(String companyName) {
        return companiesMap.get(companyName);
    }
}