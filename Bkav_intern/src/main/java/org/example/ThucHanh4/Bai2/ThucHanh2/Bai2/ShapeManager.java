package org.example.ThucHanh4.Bai2.ThucHanh2.Bai2;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<Shape> shapes;

    public ShapeManager() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayAll() {
        for (Shape shape : shapes) {
            shape.display();
        }
    }

    public double totalArea() {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    public void countShapes() {
        int ellipseCount = 0, circleCount = 0, rectangleCount = 0, squareCount = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                squareCount++;
            } else if (shape instanceof Rectangle) {
                rectangleCount++;
            } else if (shape instanceof Circle) {
                circleCount++;
            } else if (shape instanceof Ellipse) {
                ellipseCount++;
            }
        }

        System.out.println("Thống kê số lượng:");
        System.out.println("Ellipses: " + ellipseCount);
        System.out.println("Circles: " + circleCount);
        System.out.println("Rectangles: " + rectangleCount);
        System.out.println("Squares: " + squareCount);
    }
}
