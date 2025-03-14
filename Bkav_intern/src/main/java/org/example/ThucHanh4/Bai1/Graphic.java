package org.example.ThucHanh4.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Graphic extends Shape{
    // khởi tạo lưu trữ danh sách shapes
    private List<Shape> shapes = new ArrayList<>();
    public Graphic() {}

    // contructer coppy các đối tượng vào danh sách mới
    public Graphic(Graphic graphic) {
        for (Shape shape : graphic.shapes) {
            this.shapes.add(shape.Clone());
        }
    }
    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Point");
        for (Shape shape : shapes) {
            shape.operation();
        }
    }

    @Override
    Shape Clone() {
        return new Graphic(this);
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
