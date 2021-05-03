package com.company;

public class Main {

    public static void main(String[] args) {
        CEO ceo = new CEO("Jack", "Ma", 30000);
        Programmer dang = new Programmer("Dang", "Red", 10000);

        ceo.orderWebsite(((Programmer) dang).firstName);

    }
}
