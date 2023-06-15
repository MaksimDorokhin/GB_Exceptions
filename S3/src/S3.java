import java.io.IOException;

public class S3 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println("Считаю");
            System.out.println(counter.getCounter());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец блока try-catch");
    }
}
