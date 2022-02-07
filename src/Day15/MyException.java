package Day15;

public class MyException extends Throwable {
    private String message;
    public MyException(String message){
        super(message);
    }
}
