package com.Taind2008110304.Tuan05;

import java.util.Scanner;

public class baitaptuan5 {
    public static final String remove = null;
    String hoVaTen;
    Double diemTB;
    Scanner n = new Scanner(System.in);

    void inThongTin() {
        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("Điểm trung bình: " + diemTB);
    }

    void nhapThongTin() {
        System.out.print("Nhập họ và tên: ");
        hoVaTen = n.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTB = n.nextDouble();
    }

}
