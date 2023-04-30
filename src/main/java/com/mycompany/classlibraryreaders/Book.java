/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classlibraryreaders;

/**
 *
 * @author viktor
 */
public class Book {
    private String bookTitle;
    private String writersName;

    public Book(String bookTitle, String writersName) {
        this.bookTitle = bookTitle;
        this.writersName = writersName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getWritersName() {
        return writersName;
    }
}
