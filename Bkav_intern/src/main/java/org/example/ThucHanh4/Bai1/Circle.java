package org.example.ThucHanh4.Bai1;

public class Circle extends Shape{
    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Circle");
    }

    public Circle() {
    }

    // contructer coppy
    public Circle(Circle circle) {
    }

    // tạo một đối tượng mới qua contructer sao chép
    @Override
    Shape Clone() {
        return new Circle(this);
    }
}
