public class S4 {
    /*
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

    2. Создайте класс исключений, которое будет возникать при обращении к пустому
    элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке

    3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
     */
    public static void main(String[] args) {
       try {
           test();
       } catch (DivideByZeroException e) {
           throw new RuntimeException();
       }

    }

    public static void test() throws DivideByZeroException {
        System.out.println("Начало работы");
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException(e);
        }
    }
}

