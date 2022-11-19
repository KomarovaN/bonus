public class Main {
    public static void main(String[] args) {
        int score = 5000;        // начальный счёт
        int deposit = 1050;    // сумма пополнения
        int limit = 1000;      // минимальная сумма вклада для начисления бонусов
        int portion = 100;     // сумма, на которую начисляется единица бонуса
        int weight = 1;        // единица бонуса
        int bonus = 0;         // начисленные бонусы

        if (portion != 0) {
            if (deposit > limit) {
                bonus = deposit * weight / portion;
            }
        }
        System.out.println("Итого на счете: " + (score + deposit) + " руб.");
        System.out.println("Начислено бонусов: " + bonus + " руб.");
    }
}