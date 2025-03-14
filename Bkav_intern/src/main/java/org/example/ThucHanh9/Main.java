package org.example.ThucHanh9;

public class Main {
    public static void main(String[] args) {
        // Tạo đa thức 5.3x^3 - 1.2x + 123.5
        DaThuc daThuc1 = new DaThuc(null);
        daThuc1.themHangTu(5.3, 3);
        daThuc1.themHangTu(-1.2, 1);
        daThuc1.themHangTu(123.5, 0);

        System.out.print("Đa thức 1: ");
        daThuc1.inDaThuc();

        // Tạo đa thức 3.1x^2 + 2x - 50
        DaThuc daThuc2 = new DaThuc(null);
        daThuc2.themHangTu(3.1, 2);
        daThuc2.themHangTu(2, 1);
        daThuc2.themHangTu(-50, 0);

        System.out.print("Đa thức 2: ");
        daThuc2.inDaThuc();

        // Cộng hai đa thức
        DaThuc tongDaThuc = daThuc1.congDaThuc(daThuc2);
        System.out.print("Tổng hai đa thức: ");
        tongDaThuc.inDaThuc();

        // Tính giá trị tại x = 2
        double giaTri = tongDaThuc.tinhGiaTri(2);
        System.out.println("Giá trị của tổng đa thức tại x = 2 là: " + giaTri);
    }
}
