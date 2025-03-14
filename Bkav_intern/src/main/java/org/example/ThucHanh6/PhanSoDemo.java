package org.example.ThucHanh6;

import java.io.IOException;

public class PhanSoDemo {
    public static void main(String[] args) {
        try {
            // Tạo hai phân số
            PhanSo ps1 = new PhanSo(3, 4);
            PhanSo ps2 = new PhanSo(2, 5);

            // Thực hiện phép toán
            PhanSo sum = ps1.add(ps2);
            PhanSo diff = ps1.sub(ps2);
            PhanSo prod = ps1.multiple(ps2);
            PhanSo quot = ps1.divide(ps2);

            // Xuất kết quả
            System.out.println("Phân số 1: " + ps1);
            System.out.println("Phân số 2: " + ps2);
            System.out.println("Tổng: " + sum);
            System.out.println("Hiệu: " + diff);
            System.out.println("Tích: " + prod);
            System.out.println("Thương: " + quot);

            // Đọc phân số từ file
            PhanSo psFromFile = PhanSo.input("phanso.txt");
            System.out.println("Phân số đọc từ file: " + psFromFile);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
