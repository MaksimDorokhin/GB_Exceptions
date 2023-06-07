public class S1Hw3 {
    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
    в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
    RuntimeException, т.е. ваше
     */

    public static void main(String[] args) {
        // Оповещаем что массивы не могут быть нулевыми
//        int[] a = null;
//        int[] b = {1,2,3};
        // Оповещаем что длины массивов не равны
//         int[] a = {2,4,6,8,10};
//         int[] b = {1,2,3};
        // Оповещаем о нулевом делителе
//        int[] a = {2,4,6,8,10};
//        int[] b = {1,2,0,4,5};
        // Успешный вариант выполнения метода divideArrays
        int[] a = {2,4,6,8,10};
        int[] b = {1,2,3,4,5};
        System.out.println(printArray(divideArrays(a, b)));
    }

    static int[] divideArrays (int[] a, int[] b) {
        if (a == null || b == null) {
            throw new RuntimeException("Arrays cannot be null");
        }
        if (a.length != b.length) {
            throw new RuntimeException("Lengths of arrays are not equal");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Value of divider from array b with index "+ i + " is zero");
            }
            result[i] = a[i] / b[i];
        }
        return result;
    }

    static String printArray(int[] a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : a) {
            stringBuilder.append(j).append(" ");
        }
        return stringBuilder.toString();
    }

}
