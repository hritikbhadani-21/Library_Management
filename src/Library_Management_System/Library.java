package Library_Management_System;


import Library_Management_System.Exceptions.BookAlreadyIssuedException;
import Library_Management_System.Exceptions.BookAlreadyReturnedException;
import Library_Management_System.Exceptions.BookNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer,Book> books;

    public Library(Map<Integer, Book> books) {
        this.books = books;
    }

    public Library(){
        books=new HashMap<>();
    }

    public void addBook(Book book) throws BookAlreadyIssuedException{
        int id=book.getBookId();


        if(books.containsKey(id)){
            System.out.println(book.getTitle());
            throw new BookAlreadyIssuedException();
        }else{
            books.put(id,book);
            System.out.println("Book added successfully.");
        }

    }

    public void issueBook(int bookId) throws BookNotFoundException ,BookAlreadyIssuedException{

        if (!books.containsKey(bookId)) {
            throw new BookNotFoundException();
        }

        Book book = books.get(bookId);

        if (book.isIssued()) {
            throw new BookAlreadyIssuedException();
        } else {
            book.setIssued(true);
            System.out.println("Book issued Successfully");
        }
    }

    public void returnBook(int bookId) throws BookNotFoundException, BookAlreadyReturnedException {

        Book book = books.get(bookId);

        if (book == null) {
            throw new BookNotFoundException();
        }
        else if (!book.isIssued()) {
            throw new BookAlreadyReturnedException();
        }
        else {
            book.setIssued(false);
            System.out.println("Book returned successfully");
        }
    }

    public void displayAvailableBooks() {

        for (Book book : books.values()) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }
}
