package com.Taind2008110304.Tuan06;

import java.util.Scanner;

public class sanphamTestDrive {
    static Scanner n = new Scanner(System.in);
    static sanpham sanPham = new sanpham();
    static int chon;

    public static void main(String[] args) {
        System.out.print("Số lượng sản phẩm cần nhập: ");
        sanPham.sl = n.nextInt();
        sanpham[] DSSP = new sanpham[sanPham.sl];
        do {
            System.out.println("-------------------MENU--------------------");
            System.out.println(">>1. Nhập danh sách sản phẩm.");
            System.out.println(">>2. Sắp xếp tăng dần và xuất ra mà hình.");
            System.out.println(">>3. Tìm và xóa sản phẩm.");
            System.out.println(">>4. Xuất giá trị trung bình của sản phẩm.");
            System.out.println(">>5. Thêm sản phẩm vào vị trí bất kì.");
            System.out.println(">>6. Kết thúc.");
            System.out.print("- Nhập vào sự lựa chọn của bạn(1->6): ");
            chon = n.nextInt();
            switch (chon) {
            case 1:
            nhap(DSSP);
            break;
            case 2
            

               
}
