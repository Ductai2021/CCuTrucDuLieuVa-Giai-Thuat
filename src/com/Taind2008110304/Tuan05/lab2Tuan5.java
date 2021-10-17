package com.Taind2008110304.Tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab2Tuan5 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr = nhap();
        xuat(arr);
        ngauNhien(arr);
        sapXep(arr);
        Scanner biennhap = new Scanner(System.in);
        System.out.println("Họ tên cần xóa: ");
        String hoTen = biennhap.nextLine();
        xoa(arr);
    }

    // 1. Nhập danh sách
    public static ArrayList<String> nhap() {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập vào họ và tên: ");
            String x = scanner.nextLine();
            list.add(x);
            System.out.print("Nhập thêm(Y/N)? ");
            if (scanner.nextLine().equals("N")) {
                break;
            }

        }
        return list;
    }

    // 2. Xuất danh sách
    public static void xuat(ArrayList<String> list2) {
        System.out.println("Danh sách họ và tên: ");
        for (String string : list2) {
            System.out.println("Xuất danh sách họ và tên: " + string);
        }
    }

    // 3. Xuất danh sách ngẫu nhiên
    public static void ngauNhien(ArrayList<String> list3) {
        Collections.shuffle(list3);
        System.out.println("Xuất danh sách ngẫu nhiên: " + list3);
    }

    // 4. Sắp xếp giảm dần và xuất danh sách
    public static void sapXep(ArrayList<String> list4) {
        Collections.sort(list4);
        System.out.println("Sắp xếp phần tử tăng dần: " + list4);
        Collections.reverse(list4);
        System.out.println("Đảo các phần tử: " + list4);
    }

    // 5. Tìm và xóa họ tên nhập từ bàn phím
    public static void xoa(ArrayList<String> list5) {

        list5.remove(list5);

    }

}
