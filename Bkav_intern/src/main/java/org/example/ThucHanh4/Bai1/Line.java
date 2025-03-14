package org.example.ThucHanh4.Bai1;

public class Line extends Shape {
    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Line");
    }

    public Line() {
    }
    public Line(Line line) {
    }

    // tạo một đối tượng mới qua contructer sao chép
    @Override
    Shape Clone() {
        return new Line(this);
    }
}
