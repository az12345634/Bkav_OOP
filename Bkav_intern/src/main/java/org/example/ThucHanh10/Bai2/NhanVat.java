package org.example.ThucHanh10.Bai2;

public abstract class NhanVat {
    protected VuKhiHanhVi vukhi;

    public void setVukhi(VuKhiHanhVi vukhi) {
        this.vukhi = vukhi;
    }

    public void chienDau() {
        if (vukhi != null) {
            vukhi.suDungVuKhi();
        }else {
            System.out.println("Chưa có vũ khí");
        }
    }

    public abstract void hienthi();
}
