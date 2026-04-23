package Library_Management_System.Exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(){
        System.out.println("Book Not Found");
    }
}
