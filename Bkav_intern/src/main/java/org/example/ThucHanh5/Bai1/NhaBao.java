package org.example.ThucHanh5.Bai1;

import java.util.Scanner;

public class NhaBao extends NhanVien{
    private int soBaiDang;

    public NhaBao() {}

    @Override
    public void hienThiNhanVien() {
          System.out.println("Nhân viên" + getTenNV() + ", " +"Số bài đăng: " + soBaiDang);
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bài đã đăng: ");
        soBaiDang = scanner.nextInt();
    }

    public NhaBao(String tenNV, ToaBao toaBao, int soBaiDang) {
        super(tenNV, toaBao);
        this.soBaiDang = soBaiDang;
    }

    public int getSoBaiDang() {
        return soBaiDang;
    }

    public void setSoBaiDang(int soBaiDang) {
        this.soBaiDang = soBaiDang;
    }

}