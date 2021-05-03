package com.company;

public class Employee {
    public String firstName;
    public String lastName;
    public int salary;

    Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void hello() {
        System.out.println("Hello " + this.firstName);
    }

    public int getSalary() {
        return this.salary;
    }
}

