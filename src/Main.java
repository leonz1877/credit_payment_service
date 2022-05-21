import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService(); // создаем переменную класса

        int creditAmount = 1000_000; // сумма кредита, руб

        int creditPeriod = 1; // срок кредита, лет

        double creditRate = 9.99; // ставка кредита в процентах

        int payment = (int) service.calculate(creditAmount, creditPeriod, creditRate); //вызов метода для расчета


        System.out.printf("%nСумма кредита, руб: %,d %nСтавка по кредиту: %.2f \n%nСрок кредита, лет: %d %nЕжемесячный платеж: %,d \n",
                creditAmount, creditRate, creditPeriod, payment); // выводим вконсоль результаты;

        creditPeriod = 2;

        payment = (int) service.calculate(creditAmount, creditPeriod, creditRate);

        System.out.printf("%nСрок кредита, лет: %d %nЕжемесячный платеж: %,d \n",
                creditPeriod, payment);

        creditPeriod = 3;

        payment = (int) service.calculate(creditAmount, creditPeriod, creditRate);

        System.out.printf("%nСрок кредита, лет: %d %nЕжемесячный платеж: %,d \n",
                creditPeriod, payment);

    }

}
