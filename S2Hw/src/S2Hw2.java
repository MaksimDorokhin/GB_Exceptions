public class S2Hw2 {
    public static void main(String[] args) {
        // Добавим инициализацию массива intArray
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int d = 0; // Вынес за блок try
        try {
            int catchedRes1 = intArray[8] / d; // Сменил тип catchedRes1 на int
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
