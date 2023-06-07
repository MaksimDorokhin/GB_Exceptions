public class S1Hw1 {

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void main(String[] args) {
        // ArithmeticException
        System.out.println(divide(10, 0));
        // ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1,2,3,4,5};
        addToArray(arr, 5,6);
        // NullPointerException
        System.out.println(numbersInString(null));

    }
    static int divide (int a, int b) {
        return a / b;
    }

    static void addToArray(int[] arr, int index, int value) {
        arr[index] = value;
    }

    static int numbersInString (String numbers){
        char[] numArray = numbers.toCharArray();
        int sum = 0;
        for (char c : numArray) {
          if (Character.isDigit(c)){
              sum++;
          }
        }
        return sum;
    }
}
