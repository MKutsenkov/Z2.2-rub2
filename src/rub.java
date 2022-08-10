public class rub {


        public static void main(String[] args) {

            int schet = 100;                             // было на счете
            int popolnenie = 2500;                        //пополнение ВВОДИТЬ РУЧКАМИ
            int bonus = popolnenie / 100;                //расчет бонуса
            int itog1 = schet + popolnenie + bonus;      //итог с бонусом
            int itog2 = schet + popolnenie;              // итог без бонуса

            if (popolnenie > 1000) {

                System.out.print("Баланс ");
                System.out.print(itog1);
                System.out.println(" руб.");
                System.out.print("Начислено бонусов ");
                System.out.println(bonus);
            } else {
                System.out.print("Баланс ");
                System.out.print(itog2);
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
