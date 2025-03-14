package org.example.ThucHanh3.Bai1;
//Lớp người dùng chung
public class Person {
    public enum Gender {
        Nam, Nữ
    }

    private static int idCounter = 1;
    private final int id;
    private String name;
    private final int yearOfBirth;
    private Gender gender;

    public Person(String name, int yearOfBirth, Gender gender) {
        this.id = idCounter++;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth; // Không có setter vì final
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Year of Birth: " + yearOfBirth + ", Gender: " + gender);
    }
}