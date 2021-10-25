package com.Taind2008110304.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    static Scanner n = new Scanner(System.in);
    static ArrayList<Apple> DS = new ArrayList<Apple>();

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("==========MENU==========");
            System.out.println(">>1. nhập thông tin táo.");
            System.out.println(">>2. Tìm táo theo màu.");
            System.out.println(">>3. xuất danh sách.");
            System.out.println(">>4.=======kết thúc======");
            System.out.print("- Nhập vào sự lựa chọn(1->4): ");
            luaChon = n.nextInt();
            switch (luaChon) {
            case 1:
                nhap();
                break;
            case 2:
                tim();
                break;
            case 3:
                xuat();
                break;
            case 4:
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.print("Quay lại MENU lựa chọn(1:yes/0:no): ");
            luaChon = n.nextInt();
        } while (luaChon == 1);
    }

    static void nhap() {

    public void nhapVaoDanhSach() {
        while (true) {

            Apple apple = new Apple();
            n.nextLine();
            DS.add(apple);
            System.out.print("Bạn có muốn nhập thêm không(1:yes/0:no): ");
            int a = n.nextInt();
            if (a == 0)
                break;
        }
    }

}

    static void tim(){

    public void timtheomau() {
        while (true){
        System.out.println("Màu cần tìm là: ");
        for (Apple apple : DS) {
            if (n.nextLine().equals(apple.color))
                apple.inThongTin();
            break;
        }
    }
    }

}

    static void xuat() {
        while (true){
        public void xuatDanhSach(){
            for(Apple apple: DS){
                apple.inThongTin();
            }
        }

    }
}
}
