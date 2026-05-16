package by.homework.lesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("4*. Ввести число с консоли, которое не заканчивается на 0." +
                "Вывести чётные и нечётные числа через while and if. Использовать оператор %.");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int ch = vvod.nextInt();

        int min = 100, max = 0;

        if (ch % 10 == 0) {
            System.out.println("Число не должно заканчиваться на 0");
        } else {
            while (ch > 0) {
                int a = ch % 10;
                if (a % 2 == 0) {
                    System.out.println(a + " четное число");
                } else System.out.println(a + " нечетное число");
                ch /= 10;
            }
        }
    }
}
