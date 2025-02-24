package com.monica.learning.core.inheritanceExamples;

public abstract class Employee {
    /*
    Create an Employee class with name, employeeId, and calculateSalary().
Create FullTimeEmployee and PartTimeEmployee, both extending Employee, and override calculateSalary().
Calculate and print salaries for both.
     */
    private String employeeName;
    private int employeeID;

    //private int noOfDays = 0;
    //private double salary;
    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        System.out.println("McKesson Employee constructor");
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return  employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    @Override
    public String toString() {
        return "Employee{" + "employeeName= " + employeeName + '\'' + ",employeeID=" + employeeID + '}';
    }
    public abstract double calculateSalary();
}

class FulltimeEmployee extends Employee {
    int noOfDays = 30;
    double salaryPerDay = 20;
    public FulltimeEmployee(String employeeName, int employeeID) {
        super(employeeName, employeeID);
    }
    @Override
    public double calculateSalary() {
        return noOfDays * salaryPerDay;
    }

}
class ParttimeEmployee extends Employee {
    int noOfDays = 15;
    double salaryPerDay = 20;
    public ParttimeEmployee(String employeeName, int employeeID) {
        super(employeeName,employeeID);
    }
    @Override
    public double calculateSalary() {
        return noOfDays * salaryPerDay;
    }
}
class EmployeeRunner {

    public static void main(String[] args) {
        Employee FulltimeEmp = new FulltimeEmployee("krishna", 5);
        double salaryOfEmpFull = FulltimeEmp.calculateSalary();
        System.out.println("Salary of Full time Employee is:" + salaryOfEmpFull);

        Employee ParttimeEmp = new ParttimeEmployee("Ganesh", 8);
        double salaryOfEmpPart = ParttimeEmp.calculateSalary();
        System.out.println("Salary of Part time Employee is:" + salaryOfEmpPart);
    }
}
