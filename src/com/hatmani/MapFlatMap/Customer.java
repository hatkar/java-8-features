package com.hatmani.MapFlatMap;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private int salary;
    private String grade;
    private List<String>phoneNumber;

    public Customer(int id, String name, int salary, String grade, List<String> phoneNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Customer() {
    }

    public Customer(int id, String name, int salary, List<String> phoneNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public Customer(int id, String name, List<String> phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
