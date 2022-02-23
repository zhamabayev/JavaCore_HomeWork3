package JavaCore.HomeWork3;

import java.util.Arrays;

public class Main {
    static Integer[] arrayInteger = {1, 2, 3, 4};
    static Integer[] arrayInteger2 = {1, 2, 3, 4};
    static String[] arrayStatic = {"1", "2", "3", "4"};


    public static void main(String[] args) {
        // write your code here
        SwapArray<Object> swapArray = new SwapArray<>();
        try {
            System.out.println(Arrays.toString(swapArray.swapElements(arrayInteger, 1, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swapElements(arrayInteger2, 1, 4)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
