package com.Taind2008110304.Tuan02;

import java.util.Scanner;

public class lab2Tuan2 {
    public static void main(String[] args) {

        double a, b, c, Delta, x1, x2;
        Scanner biennhap = new Scanner(System.in);
        System.out.println("phuong trinh bac 2 co dang la :ax2+bx+c=0");

        System.out.print("nhập vào biến a một số  :");
        a = biennhap.nextDouble();
        System.out.print("nhập vào biến b một số  :");
        b = biennhap.nextDouble();
        System.out.print("nhập vào biến c một số  :");
        c = biennhap.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("phuong trinh vo so nghiem");
                else
                    System.out.println("phuong trinh vo nghiem");
            } else
                System.out.println("phuong trinh co nghiem duy nhat x=:" + (-c / b));
        } // tinh delta
        Delta = (b * b) - (4 * a * c);
        if (Delta > 0) {
            x1 = ((-b + Math.sqrt(Delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(Delta)) / (2 * a));
            System.out.printf("phuong trinh co hai nghiem phan biet:x1=%f,x2=%f", x1, x2);
        } else if (Delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("phuong trinh co nghiem kep la " + x1);
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}