package com.Taind2008110304.Tuan03;

import java.util.Scanner;

public class lab4Tuan3 {
    public static void main(String[] args) {
        Scanner biennhap = new Scanner(System.in);
        double sd;
        String sv;
        System.out.print("Nhập số sinh viên:");
        int n = biennhap.nextInt();
        String sinhvien[] = new String[n];
        double diem[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Sinh viên thứ %d: ", i + 1);
            sinhvien[i] = biennhap.next();
            System.out.print("Điểm: ");
            diem[i] = biennhap.nextDouble();
        }
        System.out.println("Danh sách vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + sinhvien[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.print("Học lực: ");
            if (diem[i] < 5) {
                System.out.println("Yếu");
            } else if (diem[i] >= 5 & diem[i] < 6.5) {
                System.out.println("Trung bình");
            } else if (diem[i] >= 6.5 & diem[i] < 7.5) {
                System.out.println("Khá");
            } else if (diem[i] >= 7.5 & diem[i] < 9) {
                System.out.println("Giỏi");
            } else {
                System.out.println("Xuất xắc");
            }
        }
        for (int i = 0; i < n; i++) {
            if (diem[i] > diem[i + 1]) {
                sd = diem[i];
                diem[i] = diem[i + 1];
                diem[i + 1] = sd;
                sv = sinhvien[i];
                sinhvien[i] = sinhvien[i + 1];
                sinhvien[i + 1] = sv;
            }
        }

    }
}
