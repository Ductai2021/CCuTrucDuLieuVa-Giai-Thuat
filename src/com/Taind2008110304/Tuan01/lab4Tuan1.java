package com.Taind2008110304.Tuan01;

import java.util.Scanner;

public class lab4Tuan1 {
    public static void main(String[] args) {
        Double a, b, c, x1, x2, Delta;
        Scanner biennhap = new Scanner(System.in);
        System.out.println("phuong trinh bac 2 co dang la :ax2+bx+c=0");

        System.out.print("Nhập hệ số a: ");
        a = biennhap.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = biennhap.nextDouble();
        System.out.print("Nhập hệ số c: ");
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
