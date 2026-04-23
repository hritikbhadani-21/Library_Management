package Library_Management_System;

import Library_Management_System.Exceptions.BookAlreadyIssuedException;
import Library_Management_System.Exceptions.BookAlreadyReturnedException;
import Library_Management_System.Exceptions.BookNotFoundException;

public class Main {
    static void main() throws BookAlreadyIssuedException, BookNotFoundException, BookAlreadyReturnedException {
        Library lib=new Library();

        lib.addBook(new Book(1,"Java","Hritik"));
        lib.addBook(new Book(2,"DBMS","Harsh"));
        lib.addBook(new Book(3,"GenAI","pawan"));
        lib.addBook(new Book(4,"Langchain","narayan"));
        lib.addBook(new Book(5,"Java","prakash"));

        //lib.displayAvailableBooks();

        lib.issueBook(1);

        //lib.displayAvailableBooks();

        lib.returnBook(1);

        lib.issueBook(2);

        lib.issueBook(2);



    }
}
