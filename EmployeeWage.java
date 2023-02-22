package day3.assignment.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to the EmployeeWage program\n...............................");
        //Constant
        int IS_PRESENT = 1;
        //generating random numbers 10 times as 0 or 1.
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);
        //checking if employee is present or not.
        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}


