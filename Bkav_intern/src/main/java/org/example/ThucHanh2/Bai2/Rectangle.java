package org.example.ThucHanh2.Bai2;

class Rectangle extends Shape {
    protected double width, height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle - Tâm: (" + x + ", " + y + "), Chiều dài: " + width + ", Chiều rộng: " + height + ", Diện tích: " + area());
    }
}

