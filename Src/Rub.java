public class Rub {


        public static void main(String[] args) {

            int account = 100;                                  // было на счете
            int replenishment = 2500;                           //пополнение ВВОДИТЬ РУЧКАМИ
            int bonus = replenishment / 100;                    //расчет бонуса
            int result1 = account + replenishment + bonus;      //итог с бонусом
            int result2 = account + replenishment;              // итог без бонуса

            if (replenishment > 1000) {

                System.out.print("Баланс ");
                System.out.print(result1);
                System.out.println(" руб.");
                System.out.print("Начислено бонусов ");
                System.out.println(bonus);
            } else {
                System.out.print("Баланс ");
                System.out.print(result2);
                System.out.println(" руб.");
            }

            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп

            // Условным оператором проверяете превысила ли
            // сумма пополнения порог и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
        }
    

}
