package org.example.ThucHanh2.Bai2;

abstract class Shape {
    protected double x, y; // Tọa độ tâm

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public abstract void display();
}
