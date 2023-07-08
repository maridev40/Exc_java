package lesson3.Exception;

public class BirthDayInfoException extends IllegalArgumentException {

    public BirthDayInfoException(String value, String format) {
        super(String.format("Формат даты: %s не соответствует заданному: %s", value, format));
    }

}
