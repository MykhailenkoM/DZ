import java.util.Scanner;

public class Bank {
    private static int payment;
    private static int credit;
    private static int period;
    private static int cash;

    public static void main(String[] args) {
        System.out.println("Введите сумму кредита:");
        Scanner in = new Scanner(System.in);
        credit = in.nextInt();
        if (credit <= 0 || credit > 10000) {
            System.out.println("Кредит на сумму " + credit + " не выдается, должно быть от 1 и до 10000");
        } else {
            System.out.println("Введите срок кредита в месяцах:");
            Scanner ina = new Scanner(System.in);
            period = ina.nextInt();
            if (period <= 0 || period > 12) {
                System.out.println("Кредит сроком на " + period + " месяцев не выдается, должно быть от 1 и до 12 месяцев");
            } else {
                System.out.println("Кредит выдан на сумму = " + credit + " сроком на " + period + " месяцев");
            }
            payment = credit / period;
            System.out.println("Рассчетная сумма к оплате за месяц " + payment);
            paymentCredit(credit);
        }
    }


    static void paymentCredit(int credit) {
        if (Bank.period-- > 1 && Bank.credit > 0) {
            System.out.println("Введите сумму возврата");
            Scanner in = new Scanner(System.in);
            cash = in.nextInt();
            Bank.credit = Bank.credit - cash;
            System.out.println("Остаток кредида " + Bank.credit);
            System.out.println("Осталось " + period + " месяцев до конца срока кредита");
            Bank.payment = Bank.credit / Bank.period;
            System.out.println("Рассчетная сумма к оплате за месяц " + Bank.payment);
            paymentCredit(credit);
        } else if (Bank.credit == 0 & Bank.period-- < 1) {
                System.out.println("Вы заплатили кредит досрочно");
            }
            else {
                System.out.println("Вы не заплатили кредит или произошла ошибка, обратитесь к администратору.");
            }
        }
    }