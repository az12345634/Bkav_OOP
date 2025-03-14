package org.example.ThucHanh5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyToaBao{

    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    private ToaBao toaBao;

    public QuanLyToaBao() {
        this.toaBao = toaBao;
    }

    public void themNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại nhân viên:");
        System.out.println("1. Nhân viên hành chính");
        System.out.println("2. Nhà báo");
        int choice = scanner.nextInt();
        scanner.nextLine();

        NhanVien nhanVien = null;

        System.out.print("Nhập tên nhân viên: ");
        String tenNhanVien = scanner.nextLine();

        System.out.print("Nhập tên toà báo: ");
        String tenToaBao = scanner.nextLine();
        ToaBao toaBao = new ToaBao(tenToaBao);

        if (choice == 1) {
            System.out.print("Nhập chức vụ: ");
            String chucVu = scanner.nextLine();
            nhanVien = new NhanVienHanhChinh(tenNhanVien, toaBao, chucVu);
        } else if (choice == 2) {
            System.out.print("Nhập số bài đã đăng: ");
            int soBaiDang = scanner.nextInt();
            nhanVien = new NhaBao(tenNhanVien, toaBao, soBaiDang);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        danhSachNhanVien.add(nhanVien);
        System.out.println("Thêm nhân viên thành công!");
    }

    public void xoaNhanVien(String maNV) {
        if (danhSachNhanVien.removeIf(nv -> nv.getTenNV().equalsIgnoreCase(maNV))) {
            System.out.println("Xoá thành công");
        }else {
            System.out.println("tên nhân viên không tồn tại");
        }
    }

    public void hienThiNhanVienToaBao() {
        if (danhSachNhanVien.size() == 0 ){
            System.out.println("Chưa có nhân viên nào");
        }
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiNhanVien();
        }
    }

    public void hienThiNhanVienHanhChinh() {
        if (danhSachNhanVien.size() == 0 ){
            System.out.println("Chưa có nhân viên nào");
        }
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienHanhChinh) {
                nv.hienThiNhanVien();
            }
        }
    }
    
    public void hienThiNhanVien() {
        if (danhSachNhanVien.size() == 0 ){
            System.out.println("Chưa có nhân viên nào");
        }
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhaBao) {
                nv.hienThiNhanVien();
            }
        }
    }



}
