package old_dz;

import java.util.Arrays;

public class DeleteMinMaxArray {
    public static void main(String[] args) {
        int[] size = {1, 2, 2, 3, 3, 4, 63, 6, 7, 9, 9, 9, 9, 8, 9, 10, 11, 12, -3};
        System.out.println("Исходный массив: " + Arrays.toString(size));
        int countMin, countMax, min, max;
        countMin = countMax = 0;
        min = max = size[0];
        for (int i : size) {
            if (i == min) countMin++;
            if (i == max) countMax++;
            else if (i < min) {
                countMin = 1;
                min = i;
            }
            else if (i > max) {
                countMax = 1;
                max = i;
            }
        }
        System.out.println("Количество элементов \"" + max
                + "\" (максимальное значение): " + countMax + " шт.");
        System.out.println("Количество элементов \"" + min
                + "\" (минимальное  значение): " + countMin + " шт.");

        int[] result = new int[size.length - countMax - countMin];
        for (int i = 0, j = 0; i < size.length; i++) {
            if (size[i] != min && size[i] != max)
                result[j++] = size[i];
        }
        System.out.print("Итоговый массив: " + Arrays.toString(result));
    }
}

