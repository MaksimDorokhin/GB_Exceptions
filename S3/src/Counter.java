import javax.swing.*;
import java.io.IOException;

/* Создайте класс Счетчик, у которого есть метод add(),
  увеличивающий значение внутренней int переменной на 1.
  Сделайте так, чтобы с объектом такого типа можно было работать
  в блоке try-with-resources. Подумайте, что должно происходить
  при закрытии этого ресурса? Напишите метод для проверки,
  закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса,
  должен выброситься IOException
   */
public class Counter implements AutoCloseable {
    private int counter;
    private boolean closed;

    public void add() throws IOException{
        checkIsClosed();
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Resource closed in method close");
    }
    private void checkIsClosed() throws IOException{
        if (closed){
            throw new IOException("Resource is closed");
        }
    }

}
