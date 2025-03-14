package org.example.ThucHanh4.Bai2.ThucHanh2.Bai2;

public class TestShape {
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        manager.addShape(new Circle(0, 0, 5));
        manager.addShape(new Ellipse(2, 3, 4, 2));
        manager.addShape(new Rectangle(1, 1, 6, 3));
        manager.addShape(new Square(3, 3, 4));

        System.out.println("Danh sách các hình:");
        manager.displayAll();

        System.out.println("\nTổng diện tích các hình: " + manager.totalArea());

        System.out.println();
        manager.countShapes();
    }
}
