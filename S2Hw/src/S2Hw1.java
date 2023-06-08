import java.util.Scanner;

public class S2Hw1 {
    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    static float floatIO () {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()) {
            System.out.println("Вы ввели не число типа float, повторите ввод!");
            scanner.next();
        }
        float result = scanner.nextFloat();
        scanner.close();
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите число типа float: ");
        System.out.println("Ваше число: " + floatIO());
    }
}
