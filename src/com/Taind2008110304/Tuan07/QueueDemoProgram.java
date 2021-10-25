package com.Taind2008110304.Tuan07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();
        queue.add(8);
        queue.add(10);
        queue.add(2);

        // Lấy ra một phần tử - trong queue - lấy đầu

        System.out.println(queue);
        int phanTuDuocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra từ queue" + phanTuDuocLayRa);
        System.out.println("Phần tử còn lại trong queue");
        System.out.println(queue);

        // Thêm một phần tử của queue - không loại khỏi queue
        int phanDuocTham = queue.peek();
        System.out.println("Phần tử vừa được thăm " + phanDuocTham);
        System.out.println("phần tử còn lại trong queue sau thăm ");
        System.out.println(queue);

    }

}
