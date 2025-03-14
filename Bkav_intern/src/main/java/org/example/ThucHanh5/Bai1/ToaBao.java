package org.example.ThucHanh5.Bai1;

import java.util.ArrayList;

public class ToaBao {
    private String tenToaBao;
    private ArrayList<NhanVien> danhSachNhanVien;

    public ToaBao() {
        this.danhSachNhanVien = new ArrayList<>();
    }

    public ToaBao(String tenToaBao) {
        this.tenToaBao = tenToaBao;
        this.danhSachNhanVien = new ArrayList<>();
    }

    public String getTenToaBao() {
        return tenToaBao;
    }


}