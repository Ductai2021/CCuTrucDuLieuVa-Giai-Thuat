package com.Taind2008110304.Tuan06;

import java.util.Scanner;

public class sanpham {
    double donGia;
    double giamGia;
    String thue;
    int sl;
    int tenSP;

    Scanner biennhap = new Scanner(System.in);

    // HÀM TẠO SẢN PHẨM
    sanpham() {

    }

    // HÀM IN THÔNG TIN SẢN PHẨM
    void inThongtin() {
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế: " + thue);
        System.out.println("===========================");
    }

    void nhapThongTin() {
        System.out.println("-Thông tin sản phẩm:");
        System.out.print("Tên sản phẩm: ");
        tenSP = biennhap.nextInt();
        System.out.print("Đơn giá: ");
        donGia = biennhap.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = biennhap.nextDouble();
        System.out.print("Thuế: ");
        biennhap.nextLine();
        thue = biennhap.nextLine();
    }

}
