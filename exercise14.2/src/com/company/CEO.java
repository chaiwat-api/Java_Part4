package com.company;

public class CEO extends Employee {
    CEO(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }

    public void Seminar() {

    }

    public void Hire() {

    }

    public void Golf() {

    }

    public void Fire() {

    }
}
