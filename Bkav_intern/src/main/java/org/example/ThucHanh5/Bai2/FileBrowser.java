package org.example.ThucHanh5.Bai2;
// Lớp duyệt cây thư mục

public class FileBrowser  {
    public static void browse(Directory directory) {
        for (FileSystemItem item : directory.getItems()) {
            if (item instanceof File) {
                System.out.println("Tìm thấy tập tin: " + item.getName());
            } else if (item instanceof Directory) {
                System.out.println("Duyệt vào thư mục: " + item.getName());
                browse((Directory) item);
            }
        }
    }
}
