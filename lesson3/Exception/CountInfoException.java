package lesson3.Exception;

public class CountInfoException extends IllegalArgumentException {
    
    public CountInfoException(int recieve, int need){
        super(String.format("Неверное количество параметров: %s получено, %s ожидается", recieve, need));
    }
    
}
