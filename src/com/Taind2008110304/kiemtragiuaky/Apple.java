package com.Taind2008110304.kiemtragiuaky;

public class Apple {
    int id;
    int size;
    String color;
    

    Scanner n = new Scanner(System.in);

    Apple(int i, int s, String cl) {
        id = i;
        size = s;
        color = cl;
    }

    void inThongTin() {

        System.out.println("mã id: " + id);
        System.out.println("màu sắc: " + color);
        System.out.println("kích thước: " + size);
    }

    void nhapThongTin() {
        System.out.print("Nhập mã id: ");
        id = n.nextInt();
        System.out.println("Nhập kích thước: ");
        size = n.nextInt();
        System.out.print("Màu sắc: ");
        color = n.nextLine();
    }

}

    
}
