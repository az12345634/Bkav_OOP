package org.example.ThucHanh5.Bai2;

import java.util.ArrayList;
import java.util.List;

// lớp đại diện thư mục
public class  Directory extends FileSystemItem {
    private List<FileSystemItem> items;

    public Directory(String name) {
        super(name);
        this.items = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    public List<FileSystemItem> getItems() {
        return items;
    }

    @Override
    public void open() {
        System.out.println("Mở thư mục: " + name);
        for (FileSystemItem item : items) {
            System.out.println("- " + item.getName());
        }
    }
}