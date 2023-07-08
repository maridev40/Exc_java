package lesson3.Exception;

public class StringInfoException extends IllegalArgumentException {

    public StringInfoException(String name, String value) {
        super(String.format("В %s обнаружено число: %s", name, value));
    }

}
