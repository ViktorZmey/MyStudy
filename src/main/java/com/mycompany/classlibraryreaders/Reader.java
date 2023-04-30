/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classlibraryreaders;

import java.util.*;

/**
 *
 * @author viktor
 */
public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private Date dateOfBirth;
    private String numberPhone;

    public Reader(String fullName, int libraryCardNumber, String faculty, Date dateOfBirth, String numberPhone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNumberPhone() {
        return numberPhone;
    }



    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.fullName);
        hash = 97 * hash + this.libraryCardNumber;
        hash = 97 * hash + Objects.hashCode(this.faculty);
        hash = 97 * hash + this.dateOfBirth.hashCode();
        hash = 97 * hash + Objects.hashCode(this.numberPhone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reader other = (Reader) obj;
        if (this.libraryCardNumber != other.libraryCardNumber) {
            return false;
        }
        if (this.dateOfBirth != other.dateOfBirth) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.faculty, other.faculty)) {
            return false;
        }
        return Objects.equals(this.numberPhone, other.numberPhone);
    }

    public String takeBook(int numberOfBooks) {
        String result = this.fullName + " взял: " + numberOfBooks; 
        return result;
    }
    
    public String takeBook(String ... names) {
        return this.fullName + " взял: " + String.join(", ", names) + ".";
    }
    
    public String takeBook(Book ... books) {
        var booksTitles = Arrays.asList(books).stream().map((book)->book.getBookTitle()).toArray(String[]::new);
        return this.fullName + " взял: " + String.join(", ", booksTitles) + ".";
    }
    
    
    public String returnBook(int numberOfBooks) {
        
        String result = this.fullName + " вернул: " + numberOfBooks; 
        return result;
    }
    
    
    public String returnBook(String ... names) {
        return this.fullName + " вернул: " + String.join(", ", names) + ".";
    }
    
    public String returnBook(Book ... books) {
        String[] booksTitles = (String[]) Arrays.asList(books).stream().map((book)->book.getBookTitle()).toArray();
        return this.fullName + " вернул: " + String.join(", ", booksTitles) + ".";
    }
    
   
}
