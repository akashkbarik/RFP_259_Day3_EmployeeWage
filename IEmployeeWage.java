package day3.assignment.employeewage;

public interface IEmployeeWage {
        public void addCompany(Company company);

        public int getTotalWage(String companyName);

        public Company getCompany(int index);

        public Company getCompany(String companyName);
}
