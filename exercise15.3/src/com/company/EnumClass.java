package com.company;

public class EnumClass {
    enum Status {
        HEALTHY,
        SLEEPY,
        DEAD
    }
    public static void main(String[] args) {
        Status myStatus = Status.DEAD;
        switch (myStatus) {
            case HEALTHY:
                System.out.println("พร้อมจะลุยกันมานานแล้วววว!!");
                break;
            case SLEEPY:
                System.out.println("ง่วงจังขอกาแฟหน่อย");
                break;
            case DEAD:
                System.out.println("ไม่ไหวแล้วไปนอนละบายยย");
                break;
        }
    }
}
