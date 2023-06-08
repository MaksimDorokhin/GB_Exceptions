import java.io.FileNotFoundException;

public class S3Hw3 {
    public static void main(String[] args) { // Удалил throws Exception
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 }; // Инициализации всех переменных перенес выше блока try
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) { // Переместил выше Throwable
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) { // Переместил выше Throwable
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        // Удалил FileNotFoundException т.к. никогда не выбрасывается этим методом, нет работы с файлами
        System.out.println(a + b);
    }

}
