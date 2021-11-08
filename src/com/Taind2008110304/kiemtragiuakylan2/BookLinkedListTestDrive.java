package com.Taind2008110304.kiemtragiuakylan2;

import java.util.Scanner;

public class BookLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);
        System.out.print("Nhập số lượng sách :");
        int sL = book.nextInt();
        BookLinkedList danhSach = new BookLinkedList(sL);

        danhSach.NhapDSbook();

        danhSach.inDanhSach();

        danhSach.themVaoDau();

        danhSach.themVaoCuoi();

        System.out.println("====Danh sách book sau khi thêm ====");
        danhSach.inDanhSach();

        System.out.print("Nhập mã id sách muốn thêm vào đằng trước: ");
        int vitriThem = book.nextInt();
        danhSach.themApple(vitriThem);
        danhSach.inDanhSach();

        System.out.println("Danh sách sau khi xóa cuối: ");
        danhSach.xoaTail();
        danhSach.inDanhSach();

    }
}
