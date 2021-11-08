package com.Taind2008110304.kiemtragiuakylan2;

import java.util.Scanner;

public class BookLinkedList {
    Node head = null;
    Node tail = null;
    int sL;

    BookLinkedList(int soLuong) {
        sL = soLuong;
    }

    void addTail(Book data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    void addHead(Book data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    void NhapDSbook() {
        Scanner book = new Scanner(System.in);
        head = null;
        tail = null;

        for (int i = 0; i < sL; i++) {
            System.out.println("sách " + i);
            System.out.print("Mã id sách :");
            int id = book.nextInt();
            book.nextLine();
            System.out.print("Số lượng sách : ");
            String sl = book.nextLine();
            System.out.print("Giá sách : ");
            Double gia = book.nextDouble();

            addTail(new Book(id, sl, gia));
        }
    }

    void themVaoCuoi() {
        Scanner book = new Scanner(System.in);
        System.out.println("Nhập thông tin sách muốn thêm vào cuối :");
        System.out.print("Mã id sách :");
        int id = book.nextInt();
        book.nextLine();
        System.out.print("số lượng sách : ");
        String sl = book.nextLine();
        System.out.print("giá sách : ");
        Double gia = book.nextDouble();
        addTail(new Book(id, sl, gia));
    }

    void themVaoDau() {
        Scanner book = new Scanner(System.in);
        System.out.println("Nhập thông tin sách muốn thêm vào đầu :");
        System.out.print("Mã id sách :");
        int id = book.nextInt();
        book.nextLine();
        System.out.print("số lượng sách : ");
        String sl = book.nextLine();
        System.out.print("giá sách : ");
        Double gia = book.nextDouble();
        addTail(new Book(id, sl, gia));

    }

    boolean find(int tim) {
        Node current = head;

        while (current != null) {
            if (current.data.ma == tim) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    void inDanhSach() {
        int i = 0;
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("=====Danh sách book=====");
        while (current != null) {
            System.out.println("sách " + i);
            current.data.inThongTin();
            current = current.next;
            i++;
        }
        System.out.println("=======================");

    }

    void themApple(int viTri) {
        Scanner book = new Scanner(System.in);
        System.out.println("Nhập thông tin quả táo cần thêm :");
        System.out.print("Mã id sách :");
        int id = book.nextInt();
        book.nextLine();
        System.out.print("số lượng sách : ");
        String sl = book.nextLine();
        System.out.print("giá sách : ");
        Double gia = book.nextDouble();
        addTail(new Book(id, sl, gia));
        Node newNode = new Node(new Book(id, sl, gia));

        Node before = head;

        Node current = before.next;

        while (current != null) {
            if (current.data.ma == viTri) {
                before.next = newNode;
                newNode.next = current;
                return;

            }
            before = before.next;
            current = before.next;

        }
    }

    void xoaTail() {
        Node before = head;
        Node current = before.next;

        while (current != null) {
            if (current.next == null) {
                before.next = null;
                return;
            }
            before = before.next;
            current = before.next;
        }

    }

}
