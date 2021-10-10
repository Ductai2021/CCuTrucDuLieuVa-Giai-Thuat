package com.Taind2008110304.Tuan02;

import java.util.Scanner;

public class lab3Tuan2 {
    public static void main(String[] args) {
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
