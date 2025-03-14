package org.example.ThucHanh7.Bai2;

public class Node {
    String value;
    Node left, right;

    // Constructor cho nút lá (số nguyên)
    public Node(int value) {
        this.value = String.valueOf(value);
        left = right = null;
    }

    // Constructor cho nút trong (phép toán)
    public Node(String operator, Node left, Node right) {
        this.value = operator;
        this.left = left;
        this.right = right;
    }

    // Kiểm tra xem có phải là nút lá không
    public boolean isLeaf() {
        return (left == null && right == null);
    }
}
