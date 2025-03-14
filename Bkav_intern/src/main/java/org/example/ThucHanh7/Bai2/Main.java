package org.example.ThucHanh7.Bai2;

public class Main {
    public static void main(String[] args) {
        CayNhiPhan tree = new CayNhiPhan();

        tree.root = new Node("/",
                new Node("*",
                        new Node("+", new Node(5), new Node(3)),
                        new Node("-", new Node(10), new Node(4))
                ),
                new Node(2)
        );

        System.out.println("Giá trị của biểu thức là: " + tree.evaluate(tree.root));
    }
}