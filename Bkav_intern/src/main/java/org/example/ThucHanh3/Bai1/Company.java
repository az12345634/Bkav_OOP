package org.example.ThucHanh3.Bai1;

import java.util.Date;

public class Company {
    private String name;
    private Date dateCreate;
    private Employee[] employees;
    private int employeeCount;

    public Company(String name, Date dateCreate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.employees = new Employee[10];
        this.employeeCount = 0;
    }

    public void addNewEmployee(Employee e) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = e;
        } else {
            info();
        }
    }

    public void showListEmployees() {
        for (int i = 0; i < employeeCount; i++) {
            employees[i].display();
        }
    }

    public void info() {
        System.out.println("The company has reached the maximum number of employees!");
    }
}