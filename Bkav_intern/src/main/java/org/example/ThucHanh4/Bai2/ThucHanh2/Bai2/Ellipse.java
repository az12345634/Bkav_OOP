package org.example.ThucHanh4.Bai2.ThucHanh2.Bai2;

class Ellipse extends Shape {
    protected double majorAxis, minorAxis; // Trục lớn và trục nhỏ

    public Ellipse(double x, double y, double majorAxis, double minorAxis) {
        super(x, y);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void display() {
        System.out.println("Ellipse - Tâm: (" + x + ", " + y + "), Trục lớn: " + majorAxis + ", Trục nhỏ: " + minorAxis + ", Diện tích: " + area());
    }
}
