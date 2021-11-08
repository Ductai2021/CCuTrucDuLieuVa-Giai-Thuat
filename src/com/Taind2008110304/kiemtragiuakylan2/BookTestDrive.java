package com.Taind2008110304.kiemtragiuakylan2;

import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);
        // a)
        System.out.print("Nhập số lượng sách : ");
        int sL = book.nextInt();
        BookArrayList danhsachbook = new BookArrayList(sL);
        danhsachbook.NhapDS();

        danhsachbook.inDanhSachBook();
        // b)
        System.out.println("Nhập vị trí cần thêm vào : ");
        int viTriThem = book.nextInt();
        book.nextLine();
        danhsachbook.themBook(viTriThem);

        System.out.println("Danh sách book sau khi thêm :");
        danhsachbook.inDanhSachBook();
        // c)
        System.out.println("Nhập mã id sách cần tìm : ");
        String tim = book.nextLine();
        danhsachbook.findTheoid(tim);
        // d)
        danhsachbook.inDanhSachBook();
    }
}
