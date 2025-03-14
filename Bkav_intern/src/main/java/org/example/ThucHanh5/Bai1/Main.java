package org.example.ThucHanh5.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            QuanLyToaBao quanLyToaBao = new QuanLyToaBao();

            int choice;
            do {
                System.out.println("1. Thêm nhân viên");
                System.out.println("2. Hiển thị nhân viên trong toà báo");
                System.out.println("3. Hiển thị nhân hành chính");
                System.out.println("4. Hiển thị nhân viên nhà báo");
                System.out.println("5. Xóa nhân viên");
                System.out.println("0. Thoát");
                System.out.print("Lựa chọn: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        quanLyToaBao.themNhanVien();
                        break;
                    case 2:
                        quanLyToaBao.hienThiNhanVienToaBao();
                        break;
                    case 3:
                        quanLyToaBao.hienThiNhanVienHanhChinh();
                        break;
                    case 4:
                        quanLyToaBao.hienThiNhanVien();
                        break;
                    case 5:
                        System.out.print("Nhập mã nhân viên muốn xóa: ");
                        String maNV = scanner.next();
                        quanLyToaBao.xoaNhanVien(maNV);
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
            } while (choice != 0);
        }
    }
