package com.Taind2008110304.Tuan02;

import java.util.Scanner;

public class lab4Tuan2 {
    public static void main(String[] args) {
        System.out.println("=============Menu===========");
        System.out.println(">>1. Giải phương trình bậc I");
        System.out.println(">>2. Giải phương trình bậc II");
        System.out.println(">>3. Tính tiền điện");
        System.out.println("=============End==========");
        int suLuaChon;
        System.out.print("Lựa chọn chức năng:");

        Scanner bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch (suLuaChon) {
            case 1:
                giaiPTBacI();
                break;
            case 2:
                giaiPTbacII();
                break;
            case 3:
                tinhTienDien();
                break;
            default:
                System.out.println("yêu cầu không hợp lệ ");

        }
    }

    static void giaiPTBacI() {
        Scanner biennhap = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        Double a = biennhap.nextDouble();
        System.out.print("Nhập hệ số b: ");
        Double b = biennhap.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");

            }
        } else {
            double nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm x= " + nghiem);
        }

    }

    static void giaiPTbacII() {
        float x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập hệ số c: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            x1 = x2 = (-b / (2 * a));
            System.out.print("Phương trình có nghiệm kép x1=x2 " + x1);
        } else {
            x1 = (float) ((-b + (delta)) / (2 * a));
            x2 = (float) ((-b - (delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm: x1=" + x1 + ",x2=" + x2);
        }

    }

    static void tinhTienDien() {
        double tong, tien;
        Scanner biennhap = new Scanner(System.in);
        System.out.println("\t\tChương trình tính tiền điện của 1 tháng\n");
        System.out.print("nhập số klw điện sử dụng trong 1 tháng vào đay   :");
        tong = biennhap.nextDouble();
        if (tong <= 50) {
            tien = tong * 1678;
        } else if (tong <= 100) {
            tien = 50 * 168 + (tong - 50) * 1734;
        } else if (tong <= 200) {
            tien = 50 * 168 + (tong - 50) * 1734 + (tong - 100) * 2014;
        } else if (tong <= 300) {
            tien = 50 * 168 + (tong - 50) * 1734 + (tong - 100) * 2014 + (tong - 200) * 2536;
        } else if (tong <= 400) {
            tien = 50 * 168 + (tong - 50) * 1734 + (tong - 100) * 2014 + (tong - 200) * 2536 + (tong - 300) * 2834;
        } else {
            tien = 50 * 168 + (tong - 50) * 1734 + (tong - 100) * 2014 + (tong - 200) * 2536 + (tong - 300) * 2834
                    + (tong - 400) * 2927;
        }
        System.out.println("tiền điện phải trả tháng này là:" + tien + "vnd");

    }
}
