package com.Taind2008110304.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayList {
    ArrayList<Book> danhsachbook = new ArrayList<>();
    int sL;

    BookArrayList(int soluong) {
        sL = soluong;
    }

    // Nhập danh sách
    void NhapDS() {
        Scanner book = new Scanner(System.in);
        for (int i = 0; i < sL; i++) {
            System.out.println("sach " + i);
            System.out.print("Mã id sách :");
            int id = book.nextInt();
            book.nextLine();
            System.out.print("Số lượng sách : ");
            String sl = book.nextLine();
            System.out.print("giá sách : ");
            Double gia = book.nextDouble();

            danhsachbook.add(new Book(id, sl, gia));
        }
    }

    // Thêm sách vào kho
    void themBook(int viTri) {
        Scanner book = new Scanner(System.in);
        System.out.println("Nhập dữ liệu của sách: ");
        System.out.print("Mã id sách:");
        int id = book.nextInt();
        book.nextLine();
        System.out.print("Số lượng sách : ");
        String sl = book.nextLine();
        System.out.print("Giá sách : ");
        Double gia = book.nextDouble();
        danhsachbook.add(viTri, new Book(id, sl, gia));
    }

    // Tìm sách theo màu
    // In danh sách
    void inDanhSachBook() {
        System.out.println("===========Danh sách book=============");
        for (int i = 0; i < sL; i++) {
            Book danhSach = (Book) danhsachbook.get(i);
            System.out.println("sách " + i);
            danhSach.inThongTin();
        }
        System.out.println("==============================================");
    }

}
