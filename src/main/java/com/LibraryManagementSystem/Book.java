
package com.LibraryManagementSystem;

public class Book extends com.LibraryManagementSystem.LibraryItem {
    public Book(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowedItem(com.LibraryManagementSystem.User user) {
        if(!isBorrowed) {
            isBorrowed = true;
            System.out.println(user+" borrowed the book "+getTitle());
        }else {
            System.out.println("Book "+getTitle()+" is already borrowed!");
        }
    }
}