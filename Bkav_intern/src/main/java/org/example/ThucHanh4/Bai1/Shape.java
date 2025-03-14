package org.example.ThucHanh4.Bai1;

public abstract class Shape {
    // lớp trừu tượng và các phương thức
    abstract void operation();
    abstract Shape Clone();

    // khởi tạo các phương thức và mặc định ném ra 1 ngoại lệ
    void add(Shape shape) {
        throw new UnsupportedOperationException();
    }
    void remove(Shape shape) {
        throw new UnsupportedOperationException();
    }
    Shape getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
