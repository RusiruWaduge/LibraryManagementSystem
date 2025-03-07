package com.LibraryManagementSystem;
import java.io.Serializable;
public abstract class LibraryItem implements serializable {
    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;
    public abstract void borrowedItem(com.LibraryManagementSystem.User user);


    public LibraryItem(String title, String author, String serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}