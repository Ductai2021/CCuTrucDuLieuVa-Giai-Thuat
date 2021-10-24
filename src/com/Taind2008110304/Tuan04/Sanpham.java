package com.Taind2008110304.Tuan04;

import java.util.Scanner;

public class Sanpham {
    String tenSP;
    double gia;
    int nhap;
    Scanner n = new Scanner(System.in);

    Sanpham(String t, double g) {
        tenSP = t;
        gia = g;
    }

    void inThongTin(){

           System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " + gia);
        System.out.println("__________________________________");
    }

}
