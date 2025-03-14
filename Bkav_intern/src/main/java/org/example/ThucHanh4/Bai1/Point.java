package org.example.ThucHanh4.Bai1;

public class Point  extends Shape {
    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Point");
    }
    // tạo một đối tượng mới qua contructer sao chép
    @Override
    Shape Clone() {
        return new Point(this);
    }

    public Point() {
    }
    // contructer sao chép
    public Point(Point point) {
    }


}