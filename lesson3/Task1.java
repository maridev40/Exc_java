package lesson3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import lesson3.Exception.BirthDayInfoException;
import lesson3.Exception.CountInfoException;
import lesson3.Exception.PhoneNumberException;
import lesson3.Exception.SexInfoException;
import lesson3.Exception.StringInfoException;

public class Task1 {

    private static String[] arrInfo;
    private static int MAX_LENGHT = 6;

    public static void main(String[] args) {
        String info = getUserInfo();
        System.out.println(info);
        parseInfo(info);
        try{
            SaveFile();
        } catch (Exception e) {
            System.err.println("Ошибка записи в файл: " + e);
        }
    }

    public static String getUserInfo() {
        String result = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите через пробел: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            result = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static void parseInfo(String info) {

        arrInfo = info.split(" ");

        if (arrInfo.length != MAX_LENGHT)
        throw new CountInfoException(arrInfo.length, MAX_LENGHT);

        if (arrInfo[0].matches(".*\\d.*"))
        throw new StringInfoException("Фамилии", arrInfo[0]);

        if (arrInfo[1].matches(".*\\d.*"))
        throw new StringInfoException("Имени", arrInfo[1]);

        if (arrInfo[2].matches(".*\\d.*"))
        throw new StringInfoException("Отчестве", arrInfo[2]);

        if (!arrInfo[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}"))
        throw new BirthDayInfoException(arrInfo[3], "mm.dd.yyyy");

        if (!arrInfo[4].matches("\\d{7}"))
        throw new PhoneNumberException(arrInfo[4], "xxxxxxx");

        if (!arrInfo[5].matches("[mf]"))
        throw new SexInfoException(arrInfo[5], "f | m");
    }

    public static void SaveFile() throws IOException {

        File file = new File(arrInfo[0] + ".txt");

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.append(String.format("%s %s %s %s %s %s\n", arrInfo[0], arrInfo[1], arrInfo[2], arrInfo[3], arrInfo[4],
                    arrInfo[5]));
            writer.flush();        
        }

    }
}