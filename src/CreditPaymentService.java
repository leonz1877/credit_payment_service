public class CreditPaymentService {

    public double calculate(int creditAmount, int creditPeriod, double creditRate) {
        // объявляем для класса метод для расчета аннуитетных платежей

        int monthCreditPeriod = creditPeriod * 12; // кол-во месяцев в кредитном периоде

        double monthleyCreditRate = creditRate / 100 / 12; // месячная процентная ставка

        double annuityFactor = monthleyCreditRate * Math.pow((1 + monthleyCreditRate), monthCreditPeriod) /
                ((Math.pow((1 + monthleyCreditRate), monthCreditPeriod)) - 1);
        // считаем по формуле коэффициент аннуитета

        int monthleyPayment = (int) (creditAmount * annuityFactor); // считаем аннуитетный платеж

        return monthleyPayment; // возвращаем полученое значение

    }
}
