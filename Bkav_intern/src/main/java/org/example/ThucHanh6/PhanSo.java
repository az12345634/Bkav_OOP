package org.example.ThucHanh6;
import java.io.*;
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    // Constructor
    public PhanSo(int tu, int mau) throws ArithmeticException {
        if (mau == 0) {
            throw new ArithmeticException("Lỗi: Mẫu số không thể là 0!");
        }
        this.tu = tu;
        this.mau = mau;
        toigian();
    }

    // Tối giản phân số
    private void toigian() {
        int gcd = UCLN(Math.abs(tu), Math.abs(mau)); // Tìm ước chung lớn nhất
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) { // Đưa dấu âm lên tử số
            tu = -tu;
            mau = -mau;
        }
    }

    // Tìm ước chung lớn nhất
    private int UCLN(int a, int b) {
        return (b == 0) ? a : UCLN(b, a % b);
    }

    // Cộng hai phân số
    public final PhanSo add(final PhanSo a) {
        int newTu = this.tu * a.mau + this.mau * a.tu;
        int newMau = this.mau * a.mau;
        return new PhanSo(newTu, newMau);
    }

    // Trừ hai phân số
    public final PhanSo sub(final PhanSo a) {
        int newTu = this.tu * a.mau - this.mau * a.tu;
        int newMau = this.mau * a.mau;
        return new PhanSo(newTu, newMau);
    }

    // Nhân hai phân số
    public final PhanSo multiple(final PhanSo a) {
        int newTu = this.tu * a.tu;
        int newMau = this.mau * a.mau;
        return new PhanSo(newTu, newMau);
    }

    // Chia hai phân số
    public final PhanSo divide(final PhanSo a) throws ArithmeticException {
        if (a.tu == 0) {
            throw new ArithmeticException("Lỗi: Không thể chia cho phân số có tử số bằng 0!");
        }
        int newTu = this.tu * a.mau;
        int newMau = this.mau * a.tu;
        return new PhanSo(newTu, newMau);
    }

    // Đọc phân số từ file
    public static PhanSo input(String fileName) throws IOException {
        Scanner sc = new Scanner(new File(fileName));
        int tu = sc.nextInt();
        int mau = sc.nextInt();
        sc.close();
        return new PhanSo(tu, mau);
    }

    // hiển thị phân số
    @Override
    public String toString() {
        return (mau == 1) ? tu + "" : tu + "/" + mau;
    }

}
