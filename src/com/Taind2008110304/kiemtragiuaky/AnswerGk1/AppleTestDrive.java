package com.Taind2008110304.kiemtragiuaky.AnswerGk1;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a)
        System.out.print("Nhập số lượng táo có trong danh sách : ");
        int sL = sc.nextInt();
        AppleArrayList danhSachTao = new AppleArrayList(sL);
        danhSachTao.NhapDS();

        danhSachTao.inDanhSachApple();
        // b)
        System.out.println("Nhập vị trí cần thêm vào : ");
        int viTriThem = sc.nextInt();
        sc.nextLine();
        danhSachTao.themApple(viTriThem);

        System.out.println("Danh sách sau khi thêm :");
        danhSachTao.inDanhSachApple();
        // c)
        System.out.println("Nhập  màu sắc cần tìm : ");
        String tim = sc.nextLine();
        danhSachTao.findTheoColor(tim);
        // d)
        danhSachTao.inDanhSachApple();
    }
}
