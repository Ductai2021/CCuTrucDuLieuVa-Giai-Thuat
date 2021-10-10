package com.Taind2008110304.Tuan03;

import java.util.Scanner;

public class lab3Tuan3 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng:");
        int n = bienNhap.nextInt();
        int mang[] = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("mang[%d] = ", i);
            mang[i] = bienNhap.nextInt();
        }
        int min = mang[0];
        for (int i = 1; i < mang.length; i++) {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("mang[%d] = %d", i, mang[i]);
        }
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                t = t + mang[i];
            }
        }
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + t);
    }
}
