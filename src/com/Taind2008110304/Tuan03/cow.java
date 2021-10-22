package com.Taind2008110304.Tuan03;

public class cow {
    Double weight;
    String breed;
    String color;

    // hàm tạo
    // devlopers tạo ra Không Để JAVA compiler tạo ra

    cow() {// hàm mặc định do devlopers tạo ra
    }

    cow(Double w) {
        weight = w;
    }

    cow(Double w, String br, String cl) {
        weight = w;
        breed = br;
        color = cl;
    }

    void inThongTin() {
    }

}
