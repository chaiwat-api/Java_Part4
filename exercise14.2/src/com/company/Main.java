package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee dang = new Employee("Dang", "Red", 10000);
        Employee ceo = new CEO("Jack", "Ma", 10000);
        Programmer prog = new Programmer("Chaiwat", "Apithanawit", 10000);
        System.out.println(ceo.firstName + " " + ceo.lastName);
        CEO ceo2 = (CEO) ceo;
        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(dang);
        myList.add(ceo2);
        myList.add(prog);
        CEO ceo3 = (CEO) myList.get(1);
        Programmer prog2 = (Programmer) myList.get(2);
        ceo3.hello();
        prog2.hello();
    }
}
