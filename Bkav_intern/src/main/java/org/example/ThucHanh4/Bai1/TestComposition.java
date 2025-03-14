package org.example.ThucHanh4.Bai1;

public class TestComposition {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Shape point = new Point();
        Shape line = new Line();
        Shape circle = new Circle();
        Shape rect = new Rectangular();

        // gọi tới phuơng thức và thêm vào
        Graphic originalGraphic = new Graphic();
        originalGraphic.add(point);
        originalGraphic.add(line);
        originalGraphic.add(circle);
        originalGraphic.add(rect);

        System.out.println("Original Graphic:");
        originalGraphic.operation();

        // hiển thị
        Graphic clonedGraphic = (Graphic) originalGraphic.Clone();
        System.out.println("Cloned Graphic:");
        clonedGraphic.operation();
    }
}
