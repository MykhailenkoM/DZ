package old_dz;

import java.util.Arrays;
import java.util.Random;

public class SumElementArray {

    public static void main(String[] args) {
        int[] arr = makeRandomArr(10, 20);

        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            }
        }

        System.out.println("array: " + Arrays.toString(arr));
        System.out.format("even sum: %d\n", evenSum);
    }

    private static int[] makeRandomArr(int size, int bound) {
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }
}