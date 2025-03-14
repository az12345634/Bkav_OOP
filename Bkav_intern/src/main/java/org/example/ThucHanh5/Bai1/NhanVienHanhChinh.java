package org.example.ThucHanh5.Bai1;

import java.util.Scanner;

public class NhanVienHanhChinh extends NhanVien{
    private String chucVu;

    public NhanVienHanhChinh() {}

    public NhanVienHanhChinh(String tenNV, ToaBao toaBao, String chucVu) {
        super(tenNV, toaBao);
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void hienThiNhanVien() {
        System.out.println("Nhan vien: " + tenNV + ", Chức vụ: " + chucVu + ", Toà báo: " + toaBao.getTenToaBao());
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên: ");
        this.tenNV = scanner.nextLine();
        System.out.print("Nhập chức vụ: ");
        this.chucVu = scanner.nextLine();
    }
}
