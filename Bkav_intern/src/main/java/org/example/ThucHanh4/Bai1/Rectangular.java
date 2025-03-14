package org.example.ThucHanh4.Bai1;

public class Rectangular extends Shape{
    public Rectangular() {
    }

    public Rectangular(Rectangular rectangular) {
    }

    @Override
    void operation() {
        System.out.println("kế thừa lớp cha phương thức phù hợp cho Rectangular ");
    }

    @Override
    Shape Clone() {
        return new Rectangular(this);
    }
}
