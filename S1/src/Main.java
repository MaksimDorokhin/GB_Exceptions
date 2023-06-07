import java.util.Scanner;

public class Main {

    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2};
        int[] array2 = null;
        int[] array3 = new int[] {1,2,3,4,5};
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите числе: ");
        int number = iScanner.nextInt();
        check(test(array1, number));
        check(test(array2, number));
        check(test(array3, number));
    }

    public static void check(int code){
        switch (code) {
            case -1 -> System.out.println("Массив меньше заданной длины");
            case -2 -> System.out.println("Элемент не найден");
            case -3 -> System.out.println("Пустой массив");
            default -> System.out.println("Индекс элемента: " + code);
        }


    }

    public static int test(int[] array, int number){
        int minSize = 3;
        if(array == null){
            return -3;
        }
        if(array.length < minSize){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return i;
            }
        }
        return -2;
    }
}