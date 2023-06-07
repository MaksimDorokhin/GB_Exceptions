public class task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, 0, 5},
                {1, 1, 1}
        };
        try {
            int result = sum(matrix);
            System.out.println("Длина массива равна: " + result);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Конец работы");
    }
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length)
                throw new RuntimeException("Массив не квадратный");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1)
                    throw new RuntimeException("Элемент с индексами [" + i + ", " + j +
                            "] не равен 1 или 0");
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
