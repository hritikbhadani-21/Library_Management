package Library_Management_System.Exceptions;

public class BookAlreadyReturnedException extends Exception {
    public BookAlreadyReturnedException(){
        System.out.println("This is Already Returned");
    }
}
