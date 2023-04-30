/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classlibraryreaders;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author viktor
 */
public class ClassLibraryReadersTest {
    public static void run() {
        test();
    }
     
    static void test() {
        Book book1 = new Book("shh", "vdsfhsh");
        Book book2 = new Book("stdhhh", "vdstsdhfhsh");
        Book book3 = new Book("snfnhhh", "vdhtdhsfhsh");
        Date birthday = new GregorianCalendar(92 + 1900, 8, 17).getTime();
        Reader reader1 = new Reader("Allex", 5243, "java", birthday, "9431313");
//        reader1.setLibraryCardNumber(5);
//        reader1.takeBook("fgdsghhh", "dhdhhd", "hdfndd");
        System.out.println(reader1.takeBook(book1, book2, book3));
    }
     
     
}
