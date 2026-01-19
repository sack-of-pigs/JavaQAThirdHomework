public class Main {
    public static void main(String[] args) {
        // Текущая сумма на счету клиента
        int currentBalance = 100;

        // Сумма пополнения счёта
        int rechargeAmount = 1100;

        // Переменная для хранения количества бонусных рублей
        int bonusRubles = 0;

        // Проверяем, превышает ли сумма пополнения 1000 рублей
        if (rechargeAmount > 1000) {
            // За каждые полные 100 рублей пополнения начисляется 1 бонусный рубль
            bonusRubles = rechargeAmount / 100;
        }

        // Рассчитываем итоговую сумму на счету
        int finalBalance = currentBalance + rechargeAmount + bonusRubles;

        // Выводим результаты
        System.out.println("Текущая сумма на счету: " + currentBalance + " рублей");
        System.out.println("Сумма пополнения: " + rechargeAmount + " рублей");
        System.out.println("Начислено бонусных рублей: " + bonusRubles + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }
}
