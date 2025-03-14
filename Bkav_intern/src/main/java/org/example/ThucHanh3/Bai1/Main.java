package org.example.ThucHanh3.Bai1;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Employee.setBasicSalary(5000);

        Company company = new Company("Công ty Bkav", new Date());

        Employee e1 = new Employee("Nhân viên 1", 2003, Person.Gender.Nam, 1, new Date(), "Backend hava", 1);
        Employee e2 = new Employee("Nhân viên 2", 2003, Person.Gender.Nữ, 2, new Date(), "fronend", 2);

        company.addNewEmployee(e1);
        company.addNewEmployee(e2);

        // hiển thị
        company.showListEmployees();
    }
}
