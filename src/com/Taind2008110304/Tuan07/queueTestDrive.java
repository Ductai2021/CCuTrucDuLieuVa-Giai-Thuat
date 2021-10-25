package com.Taind2008110304.Tuan07;

import java.util.LinkedList;
import java.util.Queue;

public class queueTestDrive {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();
        queue.add(3);
        queue.add(16);
        queue.add(23);
        queue.add(27);
        queue.add(45);
        queue.add(99);
        System.out.println(queue);
        int remove = queue.remove();
        System.out.println("Lấy ra: " + remove);
        System.out.println("Còn lại: " + queue);
        int tham = queue.peek();
        System.out.println("phần tử được thăm: " + tham);
        System.out.println("còn lại sau khi thăm: " + queue);

    }

}
