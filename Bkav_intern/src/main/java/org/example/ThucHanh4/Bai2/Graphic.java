package org.example.ThucHanh4.Bai2;

import java.util.ArrayList;
import java.util.List;

public class Graphic extends Shape {
    // khởi tạo lưu trữ danh sách shapes
    private List<Shape> shapes = new ArrayList<>();

    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Point");
        for (Shape shape : shapes) {
            shape.operation();
        }
    }

    @Override
    void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    Shape getChild(int index) {
        return shapes.get(index);
    }
}
