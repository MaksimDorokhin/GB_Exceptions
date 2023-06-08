import java.util.Scanner;

public class S2Hw4 {
    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    Далее запросить повторный ввод строки
     */
    static String inputString() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String result = scanner.nextLine();
        if (result.equals(""))
            throw new RuntimeException("Пустые строки вводить нельзя!");
        scanner.close();
        return result;
    }

    public static void main(String[] args) {
        boolean stringEntered = false;

        while (!stringEntered) {
            try {
                System.out.println("Введеннная строка: " + inputString());
                stringEntered = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
