package org.example.ThucHanh4.Bai2.ThucHanh2.Bai2;

class Circle extends Ellipse {
    public Circle(double x, double y, double radius) {
        super(x, y, radius, radius);
    }

    @Override
    public void display() {
        System.out.println("Circle - Tâm: (" + x + ", " + y + "), Bán kính: " + majorAxis + ", Diện tích: " + area());
    }
}
