package org.example.ThucHanh1.Bai2;

public class Complex {
    private double thuc;
    private double ao;
    public Complex() {
    }
    public Complex(double thuc) {
        this.thuc = thuc;
        this.ao = 0;
    }
    public Complex(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public Complex(Complex other) {
        this.thuc = other.thuc;
        this.ao = other.ao;
    }
    public Complex cong(Complex other) {
        return new Complex(this.thuc + other.thuc, this.ao + other.ao);
    }
    public Complex tru(Complex other) {
        return new Complex(this.thuc - other.thuc, this.ao - other.ao);
    }

    public Complex nhan(Complex other) {
        double newThuc = this.thuc * other.thuc - this.ao * other.ao;
        double newAo = this.thuc * other.ao + this.ao * other.thuc;
        return new Complex(newThuc, newAo);
    }

    public Complex chia(Complex other) {
        double denominator = other.thuc * other.thuc + other.ao * other.ao;
        if (denominator == 0) {
            throw new ArithmeticException("Lỗi: Không thể chia cho 0!");
        }
        double newThuc = (this.thuc * other.thuc + this.ao * other.ao) / denominator;
        double newAo = (this.ao * other.thuc - this.thuc * other.ao) / denominator;
        return new Complex(newThuc, newAo);
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }

    // Phương thức hiển thị số phức
    public String toString() {
        if (ao >= 0)
            return thuc + " + " + ao + "i";
        else
            return thuc + " - " + (-ao) + "i";
    }
}