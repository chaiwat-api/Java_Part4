package com.company;

public class Programmer extends Employee {

    Programmer(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    public void CreateWebsite() {
        System.out.println("I can create a website.");
    }

    public void FixPC() {
        System.out.println("I can fix PC.");
    }

    public void InstallWindows() {
        System.out.println("I can install windows.");
    }

}
