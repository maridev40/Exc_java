package lesson2;

/*
 * Если необходимо, исправьте код:
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,34,5,5,6,5,39,64,56,4,2};
        int d = 8;
        try {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
