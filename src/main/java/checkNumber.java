import java.util.Scanner;

public class checkNumber {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Введенное значение = " + n);

        checkIsItANaturalNumber(n);

    }
    private static void checkIsItANaturalNumber(int n) {
        int var = 2;
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }
    private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println("Введенное число " + n + " простое.");
        } else {
            System.out.println("Введенное число " + n + " не простое.");
        }
    }
}