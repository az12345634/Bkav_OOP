package org.example.ThucHanh10.Bai2;

public class Test {
    public static void main(String[] args) {
        // Tạo nhân vật
        NhanVat kySi = new KySi();
        NhanVat linhCanh = new LinhCanh();

        // Hiển thị nhân vật
        kySi.hienthi();
        linhCanh.hienthi();

        // Gán vũ khí và chiến đấu
        kySi.setVukhi(new GayStrategies());
        kySi.chienDau();

        linhCanh.setVukhi(new KiemStrategies());
        linhCanh.chienDau();


        System.out.println("\n Tôi là lính canh.Sau khi thay đổi vũ khí:");
        linhCanh.setVukhi(new GayStrategies());
        linhCanh.chienDau();
    }
}
