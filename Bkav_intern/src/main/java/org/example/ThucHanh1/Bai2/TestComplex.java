package org.example.ThucHanh1.Bai2;

public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(5);
        Complex c3 = new Complex(3, 4);
        Complex c4 = new Complex(c3);

        // Hiển thị số phức
        System.out.println("Số phức c1: " + c1);
        System.out.println("Số phức c2: " + c2);
        System.out.println("Số phức c3: " + c3);
        System.out.println("Số phức c4 (bản sao của c3): " + c4);

        // Thực hiện các phép toán
        Complex sum = c3.cong(c2);
        Complex difference = c3.tru(c2);
        Complex product = c3.nhan(c2);
        Complex quotient = c3.chia(c2);

        // Hiển thị kết quả
        System.out.println("Cộng: " + c3 + " + " + c2 + " = " + sum);
        System.out.println("Trừ: " + c3 + " - " + c2 + " = " + difference);
        System.out.println("Nhân: " + c3 + " * " + c2 + " = " + product);
        System.out.println("Chia: " + c3 + " / " + c2 + " = " + quotient);
    }
}
