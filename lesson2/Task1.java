package lesson2;

import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа 
 * не должно приводить к падению приложения, вместо этого, необходимо повторно 
 * запросить у пользователя ввод данных.
 */
public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа: ");
        String str;
        while ( (str = scanner.nextLine()) != null) {
            try {
                float number = Float.valueOf(str);
                System.out.println("Вы ввели число " + Float.toString(number));
            } catch (NumberFormatException e) {
                System.err.println(e);
            } 
        }
        scanner.close();
    }
}
