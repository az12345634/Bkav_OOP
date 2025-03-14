package org.example.ThucHanh5.Bai2;

public abstract class FileSystemItem {
    protected String name;

    public FileSystemItem() {
    }

    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Phương thức mở
    public abstract void open();
}
