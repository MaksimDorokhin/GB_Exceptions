import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class S3Hw {

    public static String inputData(Scanner scanner) {
        System.out.println("Введите через пробел  ФИО, дату рождения, номер телефона, пол:");
        return scanner.nextLine();
    }

    public static int checkInput(String data) {
        String[] check = data.split(" ");
        if (check.length == 6) return -3;
        else if (check.length < 6) return -1;
        else return -2;
    }

    public static int checkField(String field) {
        if (field.toCharArray().length == 1 && (field.contains("f") || field.contains("m")))
            return 4;
        else if (field.matches("\\d{2}\\.\\d{2}\\.\\d{4}"))
            return 2;
        else if (field.matches("\\d+"))
            return 3;
        else if (field.matches("[a-zA-Zа-яА-Я]+"))
            return 1;
        else
            return 0;
    }

    public static void prepareData(String data) throws RuntimeException{
        boolean filenameSet = false;
        String filename = "";
        String[] dataArray = data.split(" ");
        int[] typeArray = new int[6];
        for (int i = 0; i < dataArray.length; i++) {
            typeArray[i] = (checkField(dataArray[i]));
        }
        int countName = 0;
        int countBirthday = 0;
        int countTelephone = 0;
        int countGender = 0;
        for (int s: typeArray) {
            switch (s) {
                case 1 -> countName++;
                case 2 -> countBirthday++;
                case 3 -> countTelephone++;
                case 4 -> countGender++;
                case 0 -> throw new RuntimeException("Вы ввели поле в неверном формате!");
            }
        }
        switch (countName) {
            case 0 -> throw new RuntimeException("Вы не ввели ни одного поля типа имя!");
            case 1 -> throw new RuntimeException("Вы ввели только одно поле типа имя!");
            case 2 -> throw new RuntimeException("Вы ввели только два поля типа имя!");
        }
        if (countName > 3) throw new RuntimeException("Вы ввели более 3-х полей типа имя!");

        if (countBirthday == 0)
           throw new RuntimeException("Вы не ввели ни одного поля типа день рождения!");
        else if (countBirthday > 1)
            throw new RuntimeException("Вы ввели больше одного поля типа день рождения!");

        if (countTelephone == 0)
            throw new RuntimeException("Вы не ввели ни одного поля типа телефон!");
        else if (countTelephone > 1)
            throw new RuntimeException("Вы ввели больше одного поля типа телефон!");

        if (countGender == 0)
            throw new RuntimeException("Вы не ввели ни одного поля типа пол!");
        else if (countGender > 1)
            throw new RuntimeException("Вы ввели больше одного поля типа пол!");

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < typeArray.length; j++) {
                if (!filenameSet && typeArray[j] == i) {
                    filename = dataArray[j];
                    filenameSet = true;
                }
                if (typeArray[j] == i)
                    sb.append("<").append(dataArray[j]).append(">");
            }
        }

        try (FileWriter writer = new FileWriter(filename)){
            writer.write(sb.toString());
            System.out.println("Файл " + filename +" создан успешно!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = inputData(scanner);
        int checkInput = checkInput(data);
        while (checkInput != -3) {
            switch (checkInput) {
                case -1 -> System.out.println("Вы ввели меньше полей, чем требуется, повторите ввод!");
                case -2 -> System.out.println("Вы ввели больше полей, чем требуется, повторите ввод!");
            }
            data = inputData(scanner);
            checkInput = checkInput(data);
        }
        scanner.close();
        System.out.println("Начинаем обработку данных");
        try {
            prepareData(data);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            }
        }
    }
