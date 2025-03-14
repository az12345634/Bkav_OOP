package org.example.ThucHanh2.Bai2;

class Square extends Rectangle {
    public Square(double x, double y, double side) {
        super(x, y, side, side);
    }

    @Override
    public void display() {
        System.out.println("Square - Tâm: (" + x + ", " + y + "), Cạnh: " + width + ", Diện tích: " + area());
    }
}
