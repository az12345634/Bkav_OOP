package org.example.ThucHanh10.Bai1;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi : ");

        try {
            InputStream in = new MyFilterInputStream(System.in);
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}