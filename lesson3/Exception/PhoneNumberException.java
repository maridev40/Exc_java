package lesson3.Exception;

public class PhoneNumberException extends IllegalArgumentException {

    public PhoneNumberException(String value, String format) {
        super(String.format("Номер телефона %s не соответсвует формату %s ", value, format));
    }

}
