package com.company;

public class Main {

    public static void main(String[] args) {
        Earthling human = new Earthling() {
            @Override
            public void move() {
                System.out.println("Walk with 2 legs.");
            }

            @Override
            public void eat() {
                System.out.println("Eat by using a spoon.");
            }
        };
        human.move();
        human.eat();
        human.stand();

        Earthling dog = new Earthling() {
            @Override
            public void move() {
                System.out.println("Walk with 4 legs.");
            }

            @Override
            public void eat() {
                System.out.println("Eat by mouth.");
            }
        };
        dog.eat();
        dog.move();
        dog.stand();

    }
}
