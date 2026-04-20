package Library_Management_System;


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

    public void addBook(Book book){
        int id=book.getBookId();

        if(books.containsKey(id)){
            System.out.println(book.getTitle()+"is"+" Already Issued");
        }else{
            books.put(id,book);
            System.out.println("Book added successfully.");
        }

    }

    public void issueBook(int bookId){
        Book book=books.get(bookId);
        if(books.containsKey(bookId)){
            book.setIssued(true);
        }else if(book==null){
            System.out.println("Book Not Found");
        }
        else{
            System.out.println("Already issued");
        }
    }

    public void returnBook(int bookId) {

        Book book = books.get(bookId);

        if (book == null) {
            System.out.println("Book not found");
        }
        else if (!book.isIssued()) {
            System.out.println("Book is already available");
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
