package org.example.ThucHanh5.Bai2;
// Lớp đại diện cho tập tin văn bản
public class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Mở tập tin văn bản: " + name);
        System.out.println("Nội dung: " + content);
    }
}
