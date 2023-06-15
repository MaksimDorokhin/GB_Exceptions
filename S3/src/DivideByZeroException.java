public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
        super("Деление на ноль");
    }

    public DivideByZeroException(Throwable cause){
        super("Деление на ноль", cause);
    }

}
