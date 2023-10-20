package org.howard.edu.lsp.midterm.problem1;

public class BookDriver {

    public static void main(String[] args) {
        Book book1 = new Book("A Thousand Splendid Suns", "Khalid Hosseini", 2007);
        Book book2 = new Book("The Hate U Give", "Angie", 2017);
        Book book3 = new Book("The Hate U Give", "Angie", 2017);
        Book book4 = new Book("The Book Thief", "Markus Zusak", 2006);

        System.out.println("Display of book’s title, author, and year: " + book1);
        System.out.println("Display of book’s title, author, and year: " + book2);
        System.out.println("Display of book’s title, author, and year: " + book3);
        System.out.println("Display of book’s title, author, and year: " + book4);

        System.out.println("book2 equals book3: " + book2.equals(book3));
        System.out.println("book3 equals book4: " + book3.equals(book4));
    }
}

