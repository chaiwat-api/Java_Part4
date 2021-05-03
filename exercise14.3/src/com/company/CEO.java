package com.company;

public class CEO extends Employee implements IWebsiteCreator {
    CEO(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }

    @Override
    public void orderWebsite(String name) {
        System.out.println(name + ",please create a website.");
    }
}