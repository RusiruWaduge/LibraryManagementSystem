package com.LibraryManagementSystem;

public class Magazine extends com.LibraryManagementSystem.LibraryItem {
    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(com.LibraryManagementSystem.User user) {
        if(!isBorrowed) {
            isBorrowed = true;
            System.out.println(user+ " borrowed the magazine "+getTitle());
        }else {
            System.out.println("The magazine "+getTitle()+" is already borrowed.");
        }
    }
}