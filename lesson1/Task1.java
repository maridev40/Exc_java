public class Task1 {

    private static String[][] strArray = {
            { "3", "2", "5", "3", "4" },
            { "1", "5", "0", "4", "7" },
            { "8", "4", "9", "5", "4" }
    };

    private static Integer[] array1 = { 3,5,7,9 };
    private static Integer[] array2 = { 1,2,3,4 };
    public static void main(String[] args) {
        int sum = sum2d(strArray);
        System.out.println("Sum = " + sum);

        int[] intArray = sumArrays(array1, array2);        
        printArray(intArray);
    }

    public static void arrayIsNull(Object obj) {
        if (obj == null)
            throw new RuntimeException("Массив не должен быть пустым");
    }

    public static void lengthIsvalid(Object[] array, int limit) {
        if (array.length < limit)
            throw new RuntimeException("Длина массива должна быть равна " + limit);
    }

    public static void valueIsValid(String val) {
        if (!val.matches("\\d+"))
            throw new RuntimeException("Значение должно быть числом");
    }

    public static int sum2d(String[][] arr) {
        arrayIsNull(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            lengthIsvalid(arr[i], 5);
            for (int j = 0; j < 5; j++) {
                valueIsValid(arr[i][j]);
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int[] sumArrays(Integer[] arr1, Integer[] arr2) {
        arrayIsNull(arr1);
        arrayIsNull(arr2);

        int max = arr1.length;
        if (max < arr2.length)
            max = arr2.length;
        lengthIsvalid(arr1, max);
        lengthIsvalid(arr2, max);

        int[] newArray = new int[max];
        for (int i = 0; i < max; i++) {
            newArray[i] = arr1[i] - arr2[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for ( int val : array) {
            System.out.print(val + " ");
        }
    }
}