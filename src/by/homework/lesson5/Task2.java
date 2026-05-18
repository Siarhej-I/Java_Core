package by.homework.lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2. Ввести 2 положительных числа с консоли с помощью сканера. " +
                "\nВывести сумму всех чисел от одного числа до другого. (Используйте цикл while)." +
                "\nПодсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int ch1 = vvod.nextInt();
        System.out.println("Введите второе число:");
        int ch2 = vvod.nextInt();

        int sum1 = 0, sum2 = 0;
        while (ch1 > 0 | ch2 > 0) {
            sum1 += ch1 % 10;
            ch1 /= 10;
            sum2 += ch2 % 10;
            ch2 /= 10;
        }
        System.out.println("Сумма чисел первого числа: " + sum1);
        System.out.println("Сумма чисел второго числа: " + sum2 );
    }
}
