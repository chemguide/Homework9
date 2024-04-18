public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] weekPayment = new int[]{5, 12, 66, 8, 1};
        int sumMonth = 0;
        for (int oneWeekPay : weekPayment) {
            sumMonth += oneWeekPay;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей", sumMonth);
        //Задача 2
        System.out.println("\n\nЗадача 2");
        int maxPay = weekPayment[1];
        int minPay = maxPay;
        for (int oneWeekPay : weekPayment) {
            if (maxPay < oneWeekPay) {
                maxPay = oneWeekPay;
            }
            if (minPay > oneWeekPay) {
                minPay = oneWeekPay;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей", minPay, maxPay);
        //Задача 3
        System.out.println("\n\nЗадача 3");
        float averageMonth = 0;
        for (int oneWeekPay : weekPayment) {
            averageMonth += oneWeekPay;
        }
        averageMonth /= weekPayment.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageMonth);
        //Задача 4
        System.out.println("\n\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}