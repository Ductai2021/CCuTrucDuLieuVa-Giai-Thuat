package com.Taind2008110304.Tuan01;

import java.util.Scanner;

public class lab2Tuan2 {
    public static void main(String[] args) {
        double Cv, dt, dai, rong, cnn;
        Scanner biennhap = new Scanner(System.in);
        System.out.print("nhập chiều dài của hình chữ nhật :");
        dai = biennhap.nextDouble();
        System.out.print("nhập chiều rông của hình chữ nhật :");
        rong = biennhap.nextDouble();
        Cv = (dai + rong) * 2;
        System.out.println("chu vi hình chữ nhật là        :" + Cv);
        dt = dai * rong;
        System.out.println("diện tích hình chứ nhật là     :" + dt);
        cnn = Math.min(dai, rong);
        System.out.println("cạnh nhỏ nhất hình chứ nhật là :" + cnn);

    }
}
