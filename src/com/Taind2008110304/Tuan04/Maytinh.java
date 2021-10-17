package com.Taind2008110304.Tuan04;

public class Maytinh {
    public class MayTinh {
        String NSX, HDH, ram, CPU;
        int SX, gia, BH;

        MayTinh(String NSX, String HDH, String ram, String CPU, int SX, int gia, int BH) {
            NSX = NSX;
            HDH = HDH;
            ram = ram;
            CPU = CPU;
            SX = SX;
            gia = gia;
            BH = BH;
        }

        void inthongtin() {
            System.out.println("Nhà sản xuất: " + NSX);
            System.out.println("Hệ điều hành: " + HDH);
            System.out.println("Ram: " + ram);
            System.out.println("CPU: " + CPU);
            System.out.println("Năm sản xuất: " + SX);
            System.out.println("Giá: " + gia);
            System.out.println("Năm bảo hành: " + BH);
        }
    }
}
