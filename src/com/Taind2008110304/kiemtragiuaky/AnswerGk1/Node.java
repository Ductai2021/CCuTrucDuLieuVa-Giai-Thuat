package com.Taind2008110304.kiemtragiuaky.AnswerGk1;

public class Node {
    Apple data;

    Node next;

    Node() {

    }

    Node(Apple d) {
        data = d;
    }

    Node(Apple d, Node n) {
        data = d;
        next = n;
    }
}
