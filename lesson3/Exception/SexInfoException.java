package lesson3.Exception;

public class SexInfoException extends IllegalArgumentException {

    public SexInfoException(String value, String format){
        super(String.format("Пол: %s не соответствует формату %s", value, format));
    }
}

