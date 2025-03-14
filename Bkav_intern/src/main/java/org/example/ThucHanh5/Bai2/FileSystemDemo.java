package org.example.ThucHanh5.Bai2;

public class FileSystemDemo {
    public static void main(String[] args) {
        // Tạo thư mục gốc
        Directory root = new Directory("Demo");

        // Tạo tập tin
        TextFile textFile = new TextFile("tài liệu.txt", "Đây là nội dung văn bản.");
        ExecutableFile exeFile = new ExecutableFile("báo cáo thống kê.exe");

        // Thêm tập tin vào thư mục gốc
        root.addItem(textFile);
        root.addItem(exeFile);

        // Tạo thư mục con
        Directory subDir = new Directory("thư mục bài tập");
        TextFile textFile2 = new TextFile("Buổi học 1.txt", "Ghi chú quan trọng.");
        subDir.addItem(textFile2);

        // Thêm thư mục con vào thư mục gốc
        root.addItem(subDir);

        // Mở thư mục gốc
        root.open();
        System.out.println();

        // Duyệt toàn bộ cây thư mục
        System.out.println("Bắt đầu duyệt cây thư mục:");
        FileBrowser.browse(root);
    }
}

