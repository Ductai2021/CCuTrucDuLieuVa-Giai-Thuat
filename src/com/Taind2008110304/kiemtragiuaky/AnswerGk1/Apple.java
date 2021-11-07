package com.Taind2008110304.kiemtragiuaky.AnswerGk1;

import org.w3c.dom.Node;

public class Apple {
    int ma;
    String khoiLuong;
    String mauSac;

    Apple(int id, String kL, String color) {
        ma = id;
        khoiLuong = kL;
        mauSac = color;
    }

    void inThongTin() {
        System.out.println("Mã của táo : " + ma);
        System.out.println("Khối lượng của táo : " + khoiLuong);
        System.out.println("Màu sắc trái táo : " + mauSac);
    }

}
