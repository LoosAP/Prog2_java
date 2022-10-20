package ora6;

public class IncorrectFIleExtensionException extends RuntimeException{
    public IncorrectFIleExtensionException(String message){
        super(message);
    }
    public IncorrectFIleExtensionException(String message, Throwable cause){
        super(message, cause);
    }

}
