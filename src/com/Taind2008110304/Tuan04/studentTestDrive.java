package com.Taind2008110304.Tuan04;

import java.util.Scanner;

public class studentTestDrive {
    public static void main(String[] args) {
        // Tạo 1 danh sách sinh viên
        student[] studentlist = new student[5];

        // nhập danh sách sinh viên từ bàn phím
        Scanner biennhap = new Scanner(System.in);

        System.out.println("Nhập danh sách sinh viên: ");

        for (int i = 0; i < studentlist.length; i++) {
            System.out.println("Nhập sinh viên thứ n " + (i + 1));
            System.out.println("Tên sinh viên: ");
            String name = biennhap.nextLine();
            System.out.println("tuổi: ");
            int age = biennhap.nextInt();
            biennhap.nextLine();// nhận vào phím enter
            studentlist[i] = new student(name, age);

        }
        // In danh sách sinh viên
        System.out.println("======In danh sách sinh viên sau nhập======");
        for (student student : studentlist) {
            student.inThongTin();
        }

    }

}
