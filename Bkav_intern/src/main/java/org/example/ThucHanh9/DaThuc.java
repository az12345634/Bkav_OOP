package org.example.ThucHanh9;
class DaThuc {
    private HangTu dau;
    // Khởi tạo từ một hạng tử
    public DaThuc(HangTu hangTuDau) {
        this.dau = hangTuDau;
    }

    public void themHangTu(double heSo, int soMu) {
        if (heSo == 0) return;

        HangTu hangMoi = new HangTu(heSo, soMu);

        if (dau == null || dau.soMu < soMu) {
            hangMoi.tiepTheo = dau;
            dau = hangMoi;
            return;
        }

        HangTu hienTai = dau;
        HangTu truocDo = null;

        while (hienTai != null && hienTai.soMu > soMu) {
            truocDo = hienTai;
            hienTai = hienTai.tiepTheo;
        }

        if (hienTai != null && hienTai.soMu == soMu) {
            hienTai.heSo += heSo;
            if (hienTai.heSo == 0) { // Nếu hệ số thành 0, loại bỏ hạng tử
                if (truocDo != null) truocDo.tiepTheo = hienTai.tiepTheo;
                else dau = hienTai.tiepTheo;
            }
        } else {
            hangMoi.tiepTheo = hienTai;
            if (truocDo != null) truocDo.tiepTheo = hangMoi;
            else dau = hangMoi;
        }
    }

    public void nhanHangTu(double heSo, int soMu) {
        HangTu hienTai = dau;
        while (hienTai != null) {
            hienTai.heSo *= heSo;
            hienTai.soMu += soMu;
            hienTai = hienTai.tiepTheo;
        }
    }

    public DaThuc congDaThuc(DaThuc daThucKhac) {
        DaThuc ketQua = new DaThuc(null);
        HangTu hienTai = this.dau;
        while (hienTai != null) {
            ketQua.themHangTu(hienTai.heSo, hienTai.soMu);
            hienTai = hienTai.tiepTheo;
        }

        hienTai = daThucKhac.dau;
        while (hienTai != null) {
            ketQua.themHangTu(hienTai.heSo, hienTai.soMu);
            hienTai = hienTai.tiepTheo;
        }

        return ketQua;
    }

    public double tinhGiaTri(double x) {
        double ketQua = 0;
        HangTu hienTai = dau;
        while (hienTai != null) {
            ketQua += hienTai.heSo * Math.pow(x, hienTai.soMu);
            hienTai = hienTai.tiepTheo;
        }
        return ketQua;
    }

    // In ra đa thức
    public void inDaThuc() {
        if (dau == null) {
            System.out.println("0");
            return;
        }

        HangTu hienTai = dau;
        boolean dauTien = true;
        while (hienTai != null) {
            if (!dauTien && hienTai.heSo > 0) {
                System.out.print(" + ");
            } else if (hienTai.heSo < 0) {
                System.out.print(" - ");
            }

            double heSoTuyetDoi = Math.abs(hienTai.heSo);
            if (hienTai.soMu == 0) {
                System.out.print(heSoTuyetDoi);
            } else if (hienTai.soMu == 1) {
                System.out.print(heSoTuyetDoi + "x");
            } else {
                System.out.print(heSoTuyetDoi + "x^" + hienTai.soMu);
            }

            dauTien = false;
            hienTai = hienTai.tiepTheo;
        }
        System.out.println();
    }
}
