package com.Taind2008110304.Tuan07;

import java.util.Stack;

import com.Taind2008110304.Tuan04.student;

public class StackDemoProgram {
    public static void main(String[] args) {
        Stack<String> Stack;

        Stack = new Stack<>();

        // thêm phần tử vào stack
        Stack.push("Welcome");
        Stack.push("to");
        Stack.push("Data structure and Algottihm");

        System.out.println(Stack);
        // Lấy ra môt phần tử đỉnh stack (xóa phần tử khỏistack)

        String poped = Stack.pop();
        System.out.println("Đã lấy ra từ danh sách" + poped);

        System.out.println("Phần tử còn lại của stack");
        System.out.println(Stack);

        // Thăm Nút Đỉnh//Không Loại Khỏi Danh Sách
        String phanTuDuocTham = Stack.peek();

        System.out.println("Thăm phần tử đỉnh: " + phanTuDuocTham);

        // Sau khi thăm
        System.out.println(Stack);

        Stack<student> stack;

    }

}
