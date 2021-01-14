package old_dz;

import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Элементы в прямом порядке");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 10) - 5);
            System.out.println(a[i]);
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = num - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}




