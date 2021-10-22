package com.Taind2008110304.Tuan03;

public class CowTestDrive {
    public static void main(String[] args) {
        cow cow;
        // cow = new cow();
        cow = new cow(10.5);
        System.out.println("weight: " + cow.weight);

        cow = new cow(15.5);
        System.out.println("weight: " + cow.weight);

        cow = new cow(25.5, "Tây ban nha", "Đen");
        System.out.println("weight: " + cow.weight + "breed: " + cow.breed + "color: " + cow.color);

    }

}