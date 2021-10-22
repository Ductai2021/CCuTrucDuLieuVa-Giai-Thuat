package com.Taind2008110304.Tuan04;

public class Dog {
    String name;
    int size;
    String color;

    public Dog() {
    };

    public Dog(int s) {
        size = s;
    }

    public Dog(int s, String c, String n) {
        size = s;
        color = c;
        name = n;
    }

    void inThongTin() {

        System.out.println("size= " + size + "color: " + color + "name: " + name);
    }
}
