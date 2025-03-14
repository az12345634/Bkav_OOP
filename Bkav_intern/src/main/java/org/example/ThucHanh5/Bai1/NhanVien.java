package org.example.ThucHanh5.Bai1;

public abstract class NhanVien {
    protected String tenNV;
    protected ToaBao toaBao;

    public NhanVien() {
    }

    public NhanVien(String tenNV, ToaBao toaBao) {
        this.tenNV = tenNV;
        this.toaBao = toaBao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public ToaBao getToaBao() {
        return toaBao;
    }

    public void setToaBao(ToaBao toaBao) {
        this.toaBao = toaBao;
    }

    public abstract void hienThiNhanVien();
    public abstract void nhapThongTin();
}
