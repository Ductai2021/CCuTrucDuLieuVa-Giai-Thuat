package com.Taind2008110304.Tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class lab1Tuan4 {
    public static void main(String[] args) {
        int n;
        double number, sum = 0;
        ArrayList<Double> arrListDouble = new ArrayList<>();
        Scanner biennhap = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của danh sách số thực: ");
        n = biennhap.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = biennhap.nextDouble();
            arrListDouble.add(number);
        }

        System.out.println("Danh sách các phần tử đã nhập: ");
        for (double danhSachThamSo : arrListDouble) {
            System.out.println(danhSachThamSo);
        }

        for (double soHang : arrListDouble) {
            sum += soHang;
        }
        System.out.println("Tổng của các phần tử trong arrListDouble = " + sum);
    }
}
