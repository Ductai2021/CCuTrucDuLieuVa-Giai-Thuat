package com.Taind2008110304.Tuan02;

import java.util.Scanner;

public class lab1Tuan2 {
    public static void main(String[] args) {
        Double a, b;
        Scanner biennhap = new Scanner(System.in);
        System.out.println("\t Giải phương trình bậc một có dạng ax+b=0");

        System.out.print("nhập vào biến a một số:");
        a = biennhap.nextDouble();

        System.out.print("nhập vào biến b một số ");
        b = biennhap.nextDouble();
        if (a == 0) {
            if (b == 0)
                System.out.println("phương trình vô số  nghiệm");
            else
                System.out.println("phương trình vô nghiệm");
        } else
            System.out.println("phương trình có một nghiệm duy nhất x= " + (-b / 2 * a));

    }

}
