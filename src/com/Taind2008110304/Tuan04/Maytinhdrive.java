package com.Taind2008110304.Tuan04;

import java.util.Scanner;

public class Maytinhdrive {
    public static void main(String[] args) {
        Maytinh maytinhlist[] = new Maytinh[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách máy tính");
        for (int i = 0; i < maytinhlist.length; i++) {
            System.out.println("Nhập máy tính thứ " + (i + 1));
            System.out.print("Nhà sản xuất: ");
            String NSX = nhap.next();
            System.out.print("Hệ điều hành: ");
            String HDH = nhap.next();
            System.out.print("Ram: ");
            String ram = nhap.next();
            System.out.print("CPU: ");
            String CPU = nhap.next();
            System.out.print("Năm sản xuất: ");
            int SX = nhap.nextInt();
            System.out.print("Giá: ");
            int gia = nhap.nextInt();
            System.out.print("Năm bảo hành: ");
            int BH = nhap.nextInt();
            maytinhlist[i] = new Maytinh(NSX, HDH, ram, CPU, SX, gia, BH);
        }
        System.out.println("====In danh sách máy tính sau khi nhập===");
        for (Maytinh maytinh : maytinhlist) {
            System.out.println("Nhà sản xuất: " + NSX + "Năm sản xuất: " + SX + "Hệ điều hành" + HDH + "Ram: " + ram
                    + "CPU: " + CPU + "Giá: " + gia + "Năm Bảo Hành: " + BH);
        }
    }
}
