package org.example.ThucHanh7.Bai2;

public class CayNhiPhan {
    Node root; // Nút gốc của cây

    // Hàm tính giá trị của cây nhị phân
    public int evaluate(Node node) {
        // Nếu là nút lá -> Trả về giá trị số nguyên
        if (node.isLeaf()) {
            return Integer.parseInt(node.value);
        }

        // Tính toán giá trị của cây con trái & phải
        int leftValue = evaluate(node.left);
        int rightValue = evaluate(node.right);

        // Thực hiện phép toán dựa vào giá trị nút trong
        switch (node.value) {
            case "+": return leftValue + rightValue;
            case "-": return leftValue - rightValue;
            case "*": return leftValue * rightValue;
            case "/":
                if (rightValue == 0) {
                    throw new ArithmeticException("Lỗi: Chia cho 0");
                }
                return leftValue / rightValue; // Chia lấy phần nguyên
            default:
                throw new IllegalArgumentException("Toán tử không hợp lệ: " + node.value);
        }
    }
}
