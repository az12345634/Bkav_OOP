package org.example.ThucHanh5.Bai2;
// Lớp đại diện cho tập tin chạy
public class ExecutableFile extends File {
    public ExecutableFile(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Chạy tập tin: " + name);
    }
}
