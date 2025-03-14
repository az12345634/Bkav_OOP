package org.example.ThucHanh1.Bai1;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.print("p1: ");
        p1.display();

        Point p2 = new Point(1.5, 2.5, 3.5);
        System.out.print("p2: ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("p3 (copy của p2): ");
        p3.display();

        p1.setHoanhDo(4.0);
        p1.setTungDo(5.0);
        p1.setCaoDO(6.0);
        System.out.print("p1 sau khi cập nhật: ");
        p1.display();

    }
}
