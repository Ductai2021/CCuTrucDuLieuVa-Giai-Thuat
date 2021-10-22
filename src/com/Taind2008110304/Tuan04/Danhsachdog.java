package com.Taind2008110304.Tuan04;

public class Danhsachdog {
    public static void main(String[] args) {
        Dog[] Danhsachdog = new Dog[4];

        Dog dog01 = new Dog(10, "Đen", "nunu");
        Dog dog02 = new Dog(12, "Trắng", "milo");
        Dog dog03 = new Dog(15, "vàng", "micky");
        Dog dog04 = new Dog(18, "Xám", "yon");

        Danhsachdog[1] = dog01;
        Danhsachdog[2] = dog02;
        Danhsachdog[3] = dog03;
        Danhsachdog[4] = dog04;

        for (Dog dog : Danhsachdog) {
            dog.inThongTin();

        }

    }
}
