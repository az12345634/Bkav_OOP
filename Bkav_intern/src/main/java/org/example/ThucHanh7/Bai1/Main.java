package org.example.ThucHanh7.Bai1;

import com.sun.source.tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        CayNhiPhan tree = new CayNhiPhan();

        // Xây dựng cây theo sơ đồ
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.right = new Node('F');
        tree.root.left.left.left = new Node('G');

        // In kết quả duyệt cây theo từng thứ tự
        System.out.println("Duyệt theo tiền tự : ");
        tree.tienTu(tree.root);
        System.out.println("\nDuyệt theo trung tự : ");
        tree.trungTu(tree.root);
        System.out.println("\nDuyệt theo hậu tự : ");
        tree.hauTu(tree.root);
    }
}
