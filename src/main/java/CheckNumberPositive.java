import java.util.Scanner;
public class CheckNumberPositive {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Введенное значение = " + n);

        checkIsPositiveNumber(n);

    }

    public static void checkIsPositiveNumber(int n) {
        if (n < 0) {
            System.out.println("Введенное число " + n + " отрицательное.");
        } else {
            System.out.println("Введенное число " + n + " положительное.");

        }

    }
}

