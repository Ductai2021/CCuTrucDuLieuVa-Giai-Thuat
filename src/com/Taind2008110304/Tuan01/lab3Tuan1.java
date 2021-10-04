package com.Taind2008110304.Tuan01;

import java.util.Scanner;

public class lab3Tuan1 {
    public static void main(String[] args) {
        double canh, V;
        Scanner biennhap = new Scanner(System.in);
        System.out.print("Chiều dài cạnh là: ");
        canh = biennhap.nextDouble();
        V = canh * canh * canh;
        System.out.printf("Thể Tích là :", V);
        System.out.println("thể tích là :" + V);
    }
}