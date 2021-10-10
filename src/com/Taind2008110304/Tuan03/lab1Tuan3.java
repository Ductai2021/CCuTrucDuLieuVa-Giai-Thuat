package com.Taind2008110304.Tuan03;

import java.util.Scanner;

public class lab1Tuan3 {
    public static void main(String[] args) {
        int i, N;
        boolean SNT = true;

        Scanner biennhap = new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        N = biennhap.nextInt();

        for (i = 2; i < N - 1; i++) {
            if (N % i == 0) {
                SNT = false;
                System.out.printf("Số %d không phải là số nguyên tố", N);
                break;
            }
            i++;
            System.out.printf(" Số %d là số nguyên tố", N);
        }
    }
}