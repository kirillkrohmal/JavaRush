package lesson04.task05;

/* МВФ
Singleton паттерн - синхронизация в методе
IMF - это Международный Валютный Фонд
Внутри метода getFund создайте синхронизированный блок
Внутри синхронизированного блока инициализируйте переменную imf так, чтобы метод getFund всегда возвращал
один и тот же объект
*/

public class Solution {
    public static class IMF {
        private static IMF imf;

        public static IMF getFund() {
            //add your code here - добавь код тут
            synchronized (IMF.class) {
                if (imf == null) {
                    imf = new IMF();
                }
            }
            return imf;
        }

        private IMF() {
        }
    }
}
