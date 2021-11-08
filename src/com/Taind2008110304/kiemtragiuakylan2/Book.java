package com.Taind2008110304.kiemtragiuakylan2;

public class Book {
    int ma;
    String soluong;
    double gia;

    Book(int id, String sl, double gia) {
        ma = id;
        soluong = sl;
        gia = gia;
    }

    void inThongTin() {
        System.out.println("Mã id cua sach : " + ma);
        System.out.println("So luong sach : " + soluong);
        System.out.println("gia sach : " + gia);
    }

}
