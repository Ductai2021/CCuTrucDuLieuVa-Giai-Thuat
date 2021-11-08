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
            System.out.print("- Nhập vào sự lựa chọn của bạn(1>>6): ");
            chon = n.nextInt();
            switch (chon) {
            case 1:
                nhap(DSSP);
                break;
            case 2:
                sapXepVaXuat(DSSP);
                break;
            case 3:
                timVaXoa(DSSP);
                break;
            case 4:
                xuatGiaTriTB(DSSP);
                break;
            case 5:
                them(DSSP);
                break;
            case 6:
                break;
            }
            System.out.print("- Quay lại MENU (1:yes/0:no): ");
            chon = n.nextInt();
        } while (chon == 1);
    }

    static void nhap(sanpham DSSP[]) {
        for (int i = 0; i < sanPham.sl; i++) {
            DSSP[i] = new sanpham();
            DSSP[i].nhapThongTin();
        }
    }

    static void sapXepVaXuat(sanpham DSSP[]) {
        sanpham tam;
        for (int i = 0; i < sanPham.sl - 1; i++) {
            for (int j = i + 1; j < sanPham.sl; j++) {
                if (DSSP[i].donGia > DSSP[j].donGia) {
                    tam = DSSP[i];
                    DSSP[i] = DSSP[j];
                    DSSP[j] = tam;
                }
            }
        }
        System.out.println("--------Danh sách sau khi sắp xếp tăng dần--------");
        for (int i = 0; i < sanPham.sl; i++) {
            DSSP[i].inThongtin();
        }
    }

    static void timVaXoa(sanpham DSSP[]) {
        System.out.print("- Nhập tên sản phẩm muốn xóa: ");
        n.nextLine();
        String ten = n.nextLine();
        for (int i = 0; i < sanPham.sl; i++) {
            if ((DSSP[i]).equals(ten)) {
                for (int j = i; j < sanPham.sl - 1; j++) {
                    DSSP[j] = DSSP[j + 1];
                }
            }
        }
        System.out.println("- Xóa thành công!");
        sanPham.sl--;
    }

    static void them(sanpham DSSP[]) {
        sanpham[] new_DSSP = new sanpham[sanPham.sl + 1];
        System.out.print("- Nhập vào vị trí muốn thêm: ");
        int vt = n.nextInt();
        for (int i = sanPham.sl; i > vt; i--) {
            new_DSSP[i] = DSSP[i - 1];
        }
        new_DSSP[vt] = new sanpham();
        new_DSSP[vt].nhapThongTin();
        for (int i = 0; i < vt; i++) {
            new_DSSP[i] = DSSP[i];
        }
        sanPham.sl++;
        for (sanpham x : new_DSSP) {
            x.inThongtin();
            break;
        }

    }

    static void xuatGiaTriTB(sanpham DSSP[]) {
        double tong = 0;
        for (int i = 0; i < sanPham.sl; i++) {
            tong = tong + DSSP[i].donGia;
        }
        System.out.println("- Giá trị trung bình của các sản phẩm là: " + tong / (sanPham.sl));
    }
}
