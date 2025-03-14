package org.example.ThucHanh7.Bai1;

public class CayNhiPhan {
    Node root;

    // Duyệt cây theo Tiền tự
    void tienTu(Node node) {
        if (node != null) {
            System.out.print(node.data + " "); // Xử lý nút gốc
            tienTu(node.left);     // Duyệt cây con trái
            tienTu(node.right);    // Duyệt cây con phải
        }
    }

    // Duyệt cây theo Trung tự
    void trungTu(Node node) {
        if (node != null) {
            trungTu(node.left);
            System.out.print(node.data + " "); // Xử lý nút gốc
            trungTu(node.right);
        }
    }

    // Duyệt cây theo Hậu tự
    void hauTu(Node node) {
        if (node != null) {
            hauTu(node.left);
            hauTu(node.right);
            System.out.print(node.data + " ");
        }
    }
}
