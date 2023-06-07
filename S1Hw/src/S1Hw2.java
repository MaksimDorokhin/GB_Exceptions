public class S1Hw2 {

   // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

    public static void main(String[] args) {
        // NumberFormatException
        String[][] matrix = matrix = new String[][]{{"А", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        System.out.println(sum2d(matrix));
        // ArrayIndexOutOfBoundsException
        matrix = new String[][]{{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        System.out.println(sum2d(matrix));
        // NullPointerException
        matrix = null;
        System.out.println(sum2d(matrix));

    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // Может привести к ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]); // Может привести NumberFormatException
                sum += val; }
        } return sum;
    }
}
