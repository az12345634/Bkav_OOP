package org.example.ThucHanh2.Bai1;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Ngăn xếp có rỗng không? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Số phần tử trong ngăn xếp: " + stack.numOfElements());

        System.out.println("Có tồn tại phần tử 20 không? " + stack.search(20));
        System.out.println("Có tồn tại phần tử 50 không? " + stack.search(50));

        System.out.println("Lấy phần tử: " + stack.pop());
        stack.display();

        System.out.println("Số phần tử sau khi pop: " + stack.numOfElements());

        System.out.println("Ngăn xếp có rỗng không? " + stack.isEmpty());
    }
}
