package ora6;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String message, Throwable cause){
        super(message, cause);
    }
}
