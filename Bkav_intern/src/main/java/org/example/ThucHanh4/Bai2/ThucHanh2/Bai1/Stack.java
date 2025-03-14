package org.example.ThucHanh4.Bai2.ThucHanh2.Bai1;

public class Stack {
    private Node top;  // Con trỏ đến đỉnh ngăn xếp
    private int size;  // Số phần tử hiện có trong ngăn xếp

    // Constructor khởi tạo ngăn xếp rỗng
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Phương thức push: Đẩy phần tử vào đỉnh ngăn xếp
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top; // Liên kết node mới với node hiện tại
        top = newNode;      // Cập nhật node mới thành đỉnh của ngăn xếp
        size++;             // Tăng kích thước ngăn xếp
    }

    // Phương thức pop: Lấy phần tử trên cùng ra khỏi ngăn xếp
    public int pop() {
        if (isEmpty()) {
            return -1; // Ngăn xếp rỗng, trả về -1
        }
        int poppedItem = top.item; // Lưu giá trị phần tử cần lấy ra
        top = top.next; // Cập nhật đỉnh mới của ngăn xếp
        size--; // Giảm kích thước ngăn xếp
        return poppedItem;
    }

    // Phương thức isEmpty: Kiểm tra ngăn xếp có rỗng không
    public boolean isEmpty() {
        return top == null;
    }

    // Phương thức numOfElements: Trả về số phần tử hiện có
    public int numOfElements() {
        return size;
    }

    // Phương thức search: Tìm kiếm một phần tử trong ngăn xếp
    public boolean search(int item) {
        Node current = top;
        while (current != null) {
            if (current.item == item) {
                return true; // Tìm thấy phần tử
            }
            current = current.next;
        }
        return false; // Không tìm thấy
    }

    // Phương thức display: Hiển thị các phần tử trong ngăn xếp
    public void display() {
        if (isEmpty()) {
            System.out.println("Ngăn xếp rỗng.");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}
