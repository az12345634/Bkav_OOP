package org.example.ThucHanh3.Bai1;
import java.util.Date;

public class Employee extends Person {
    private int employeeId;
    private Date dateJoin;
    private String position;
    private double salaryLevel;
    private static double basicSalary;

    // contructer
    public Employee(String name, int yearOfBirth, Gender gender, int employeeId, Date dateJoin, String position, double salaryLevel) {
        super(name, yearOfBirth, gender);
        this.employeeId = employeeId;
        this.dateJoin = dateJoin;
        this.position = position;
        this.salaryLevel = salaryLevel;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // trả lại thu nhập của Người lao động. Thu nhập được tính
    public double getIncome() {
        return salaryLevel * basicSalary;
    }
    public void setSalaryLevel(double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }
    public static void setBasicSalary(double salary) {
        basicSalary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId + ", Date Joined: " + dateJoin + ", Position: " + position + ", Income: " + getIncome());
    }
}
