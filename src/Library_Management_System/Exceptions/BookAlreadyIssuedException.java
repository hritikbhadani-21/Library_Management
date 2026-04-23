package Library_Management_System.Exceptions;

public class BookAlreadyIssuedException extends Exception{
    public BookAlreadyIssuedException(){
        System.out.println("Book is Already Issued");
    }
}
