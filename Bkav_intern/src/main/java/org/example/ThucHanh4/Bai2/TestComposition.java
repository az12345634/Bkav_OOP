package org.example.ThucHanh4.Bai2;

public class TestComposition {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Shape point = new Point();
        Shape line = new Line();
        Shape circle = new Circle();
        Shape rect = new Rectangular();

        Graphic graphic = new Graphic();
        graphic.add(point);
        graphic.add(line);
        graphic.add(circle);
        graphic.add(rect);

        System.out.println("Test lớp Composite:");
        graphic.operation();
    }
}
