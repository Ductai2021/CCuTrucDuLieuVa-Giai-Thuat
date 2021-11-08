package com.Taind2008110304.kiemtragiuakylan2;

public class Node {
    Book data;

    Node next;

    Node() {

    }

    Node(Book d) {
        data = d;
    }

    Node(Book d, Node n) {
        data = d;
        next = n;
    }

}
