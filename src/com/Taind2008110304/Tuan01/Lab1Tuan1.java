package com.Taind2008110304.Tuan01;

import java.util.Scanner;

public class Lab1Tuan1 {
    public static void main(String[] args) {
        String hovaten;
        double diemtb;
        Scanner biennhap = new Scanner(System.in);
        System.out.print("Nhập Họ Và Tên Của Bạn :");
        hovaten = biennhap.nextLine();
        System.out.print("Nhập Điểm Trung Bình :");
        diemtb = biennhap.nextDouble();
        System.out.printf("Họ Và Tên :" + hovaten);
        System.out.printf("Điểm Trung Bình :" + diemtb);
        System.out.printf("%s %.0fdiem", hovaten, diemtb);
    }

}
