package com.Taind2008110304.Tuan05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lab3Tuan5 {
    static ArrayList<sanPham> list = new ArrayList<sanpham>();

    public static void main(String[] args) {

        Scanner varInput = new Scanner(System.in);
        while (true) {
            System.out.println("================MENU================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Xuất danh sách sản phẩm");
            System.out.println("3. Sắp xếp giảm dần theo giá");
            System.out.println("4. Tìm sản phẩm");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Xuất giá trung bình của sản phẩm");
            System.out.println("7. Thoát");
            System.out.println("=================End============");

            System.out.println("Chọn chức năng: ");
            switch (varInput.nextInt()) {
                case 1:
                    System.out.println("Nhập sản phẩm");
                    nhap();
                    break;
                case 2:
                    System.out.println("Xuất sản phẩm");
                    xuat();
                    break;
                case 3:
                    System.out.println("Sắp xếp sản phẩm");
                    sapXep();
                    break;
                case 4:
                    System.out.println("Tìm sản phẩm");

                    break;
                case 5:
                    System.out.println("Xóa sản phẩm");
                    break;
                case 6:
                    System.out.println("Xuất giá trung bình sản phẩm");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("lỗi hệ thống");
            }

        }

    }

    public static void nhap() {
        while (true) {
            Scanner biennhap = new Scanner(System.in);
            sanPham sp = new sanpham();
            System.out.println("Tên sản phẩm:");
            sp.tenSanPham = biennhap.nextLine();
            System.out.println("Giá sản phẩm:");
            sp.giaSanPham = biennhap.nextDouble();
            List.add(sp);
            biennhap.nextLine();
            System.out.print("Nhập thêm (Y/N)? ");
            if (biennhap.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuat() {
        SanPham sp = new SanPham();
        System.out.println("Danh sách sản phẩm: ");
        for (SanPham sanPham : List) {
            System.out.println("Tên sản phẩm:  " + sp.tenSanPham);
            System.out.println("Giá sản phẩm: " + sp.giaSanPham);
        }
    }

    public static void sapXep(){
        Comparator<SanPham> comp = new <SanPham>() {
            
            }
        };Collections.sort(list,comp);

    }

    public static void tim(String tenSanPham) {

    }
}
